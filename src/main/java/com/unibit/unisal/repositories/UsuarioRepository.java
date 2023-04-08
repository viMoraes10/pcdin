package com.unibit.unisal.repositories;

import com.unibit.unisal.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

     @Query(nativeQuery = true,
        value = "select u.*       " +
                "from usuario u   " +
                "where u.id = :id " )
     Usuario findUsuarioById(int id);


     @Query("SELECT u FROM Usuario u")
     List<Usuario> getAll();


}
