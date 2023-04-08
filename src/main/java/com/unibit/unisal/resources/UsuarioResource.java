package com.unibit.unisal.resources;

import com.unibit.unisal.entities.Usuario;
import com.unibit.unisal.service.UsuarioService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value =  "/usuario")
public class UsuarioResource {

    private final UsuarioService usuarioService;

    public UsuarioResource(final UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuarioNew){

        Usuario usuario = usuarioService.insert(usuarioNew);

        return ResponseEntity.ok().body(usuario);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id,
                                          @RequestBody Usuario usuario){

        Usuario u = usuarioService.update(id, usuario);

        return ResponseEntity.ok().body(u);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> getId(@PathVariable Integer id){

        Usuario u = usuarioService.getId(id);

        return ResponseEntity.ok().body(u);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll(){

        List<Usuario> usuarioList = usuarioService.getAll();

        return  ResponseEntity.ok().body(usuarioList);
    }


}
