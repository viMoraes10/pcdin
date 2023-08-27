package com.unibit.unisal.resources;

import com.unibit.unisal.entities.Usuario;
import com.unibit.unisal.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(value =  "/usuario", produces = {"application/json"})
@Tag(name = "usuario-api")
public class UsuarioResource {

    private final UsuarioService usuarioService;

    public UsuarioResource(final UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @Operation(summary = "Busca dados de experiencia", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @PostMapping()
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuarioNew){

        Usuario usuario = usuarioService.insert(usuarioNew);

        return ResponseEntity.ok().body(usuario);
    }

    @Operation(summary = "Busca dados de experiencia", method = "PUT")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id,
                                          @RequestBody Usuario usuario){

        Usuario u = usuarioService.update(id, usuario);

        return ResponseEntity.ok().body(u);
    }

    @Operation(summary = "Busca dados de experiencia", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getId(@PathVariable Integer id){

        Usuario u = usuarioService.getId(id);
        if (u == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(u);
    }
    @Operation(summary = "Busca dados de experiencia", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping()
    public ResponseEntity<?> getAll(){

        List<Usuario> usuarioList = usuarioService.getAll();

        return  ResponseEntity.ok().body(usuarioList);
    }

}
