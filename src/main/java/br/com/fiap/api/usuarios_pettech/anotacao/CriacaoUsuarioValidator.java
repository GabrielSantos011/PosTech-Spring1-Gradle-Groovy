package br.com.fiap.api.usuarios_pettech.anotacao;

import br.com.fiap.api.usuarios_pettech.dto.UsuarioDTO;
import br.com.fiap.api.usuarios_pettech.entities.Usuario;
import br.com.fiap.api.usuarios_pettech.repository.UsuarioRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

//classe com lógica que a anotação vai fazer                      anotação,             onde
public class CriacaoUsuarioValidator implements ConstraintValidator<CriacaoUsuarioValid, UsuarioDTO> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void initialize(CriacaoUsuarioValid anotation) {

    }

    @Override
    public boolean isValid(UsuarioDTO dto, ConstraintValidatorContext context) {
        Optional<Usuario> usuario = usuarioRepository.findByEmail(dto.email());
        return usuario.isEmpty();
    }
}
