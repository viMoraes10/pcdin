package com.unibit.unisal.service;

import com.unibit.unisal.entities.Usuario;
import com.unibit.unisal.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(final UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario insert (Usuario usuarioNew){

        return usuarioRepository.save(usuarioNew);
    }

    public Usuario update ( Integer idUsuario, Usuario to){

        Usuario from = usuarioRepository.findUsuarioById(idUsuario);

        from.setAtivo(to.getAtivo());
        from.setNome(to.getNome());
        from.setSobrenome(to.getSobrenome());
        from.setDataNascimento(to.getDataNascimento());
        from.setCpf(to.getCpf());
        from.setRg(to.getRg());
        from.setEmail(to.getEmail());
        from.setCep(to.getCep());
        from.setEndereco(to.getEndereco());
        from.setPais(to.getPais());
        from.setCidade(to.getCidade());


        return from;
    }

    public Usuario getId(Integer idUsuario) {

        Usuario usuario = new Usuario();

        Optional<Usuario> u =  usuarioRepository.findById(idUsuario.longValue());

        usuario = u.get();
        return usuario;
    }

    public List<Usuario> getAll() {

        return usuarioRepository.getAll();
    }
}
