package com.aulajavanauta.usuario.business;

import com.aulajavanauta.usuario.business.converter.UsuarioConverter;
import com.aulajavanauta.usuario.business.dto.UsuarioDTO;
import com.aulajavanauta.usuario.infrastructure.entity.Usuario;
import com.aulajavanauta.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario =usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(
                usuarioRepository.save(usuario));
    }
}
