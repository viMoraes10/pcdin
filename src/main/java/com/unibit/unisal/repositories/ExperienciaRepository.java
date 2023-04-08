package com.unibit.unisal.repositories;

import com.unibit.unisal.entities.Experiencia;
import com.unibit.unisal.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Long> {

}
