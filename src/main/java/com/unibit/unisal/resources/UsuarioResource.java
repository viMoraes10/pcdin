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


    @GetMapping
    public ResponseEntity<List<Usuario>> getAll (){

        List<Usuario> usuarioList = new ArrayList<>();

        return  ResponseEntity.ok().body(usuarioList);
    }


}
