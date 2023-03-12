package com.unibit.unisal.repositories;

import com.unibit.unisal.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

     @Query(nativeQuery = true,
        value = "select u.*       " +
                "from usuario u   " +
                "where u.id = :id " )
     Usuario findUsuarioById(int id);


}
