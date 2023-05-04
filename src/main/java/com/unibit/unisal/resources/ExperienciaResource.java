package com.unibit.unisal.resources;

import com.unibit.unisal.entities.Experiencia;
import com.unibit.unisal.service.ExperienciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value =  "/experiencia")
public class ExperienciaResource {

    private final ExperienciaService experienciaService;

    public ExperienciaResource(final ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @GetMapping()
    public ResponseEntity<?>  getAll (){

        List<Experiencia> experiencia = experienciaService.getAll();

        if (experiencia.size() == 0)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(experiencia);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getId(@PathVariable Integer id){

        Experiencia experiencia = experienciaService.getId(id);

        if (experiencia != null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(experiencia);
    }

    @PostMapping()
    public ResponseEntity<?> post(@RequestBody Experiencia newExperiencia){

        Experiencia experiencia = new Experiencia();

        experienciaService.save(experiencia);

        return ResponseEntity.ok().body(experiencia);
    }

}
