package com.unibit.unisal.resources;

import com.unibit.unisal.entities.Experiencia;
import com.unibit.unisal.service.ExperienciaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping(value =  "/experiencia", produces = {"application/json"})
@Tag(name = "experiencia-api")
public class ExperienciaResource {

    private final ExperienciaService experienciaService;

    public ExperienciaResource(final ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @Operation(summary = "Busca dados de experiencia", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping()
    public ResponseEntity<?>  getAll (){

        List<Experiencia> experiencia = experienciaService.getAll();

        if (experiencia.size() == 0)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(experiencia);
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

        Experiencia experiencia = experienciaService.getId(id);

        if (experiencia != null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(experiencia);
    }

    @Operation(summary = "Inserie novas esperiencias", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Upload de arquivo realizado com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar o upload de arquivo"),
    })
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> post(@RequestBody Experiencia newExperiencia){

        Experiencia experiencia = new Experiencia();

        experienciaService.save(experiencia);

        return ResponseEntity.ok().body(experiencia);
    }

}
