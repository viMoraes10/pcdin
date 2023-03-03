package com.unibit.unisal.service;

import com.unibit.unisal.entities.Usuario;
import com.unibit.unisal.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(final UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario insert (Usuario usuarioNew){



        return usuarioRepository.save(usuarioNew);
    }
}
