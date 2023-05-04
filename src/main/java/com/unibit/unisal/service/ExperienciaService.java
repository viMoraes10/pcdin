package com.unibit.unisal.service;

import com.unibit.unisal.entities.Experiencia;
import com.unibit.unisal.repositories.ExperienciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepository;

    public ExperienciaService(final ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }

    public List<Experiencia> getAll() {

       return experienciaRepository.buscaTudo();

    }

    public Experiencia getId(final Integer experienciaId){

        return experienciaRepository.getById(Long.valueOf(experienciaId));

    }

    public Experiencia save(Experiencia newExperiencia) {

        Experiencia experiencia = new Experiencia(newExperiencia);

        return experienciaRepository.save(experiencia);
    }
}
