package com.unibit.unisal.repositories;

import com.unibit.unisal.entities.Experiencia;
import com.unibit.unisal.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Long> {

    @Query("SELECT e FROM Experiencia e")
    List<Experiencia> buscaTudo();

}
