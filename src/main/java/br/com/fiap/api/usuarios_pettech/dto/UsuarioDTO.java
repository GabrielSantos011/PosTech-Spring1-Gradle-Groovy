package br.com.fiap.api.usuarios_pettech.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record UsuarioDTO(
        Long id,
        //anotação que não permite null, vazio ou espaço vazio
        //devemos colocar o @Valid na controller também
        @NotBlank(message = "O nome não pode estar em branco.")
        String nome,
        @NotBlank(message = "O e-mail não pode estar em branco.")
        //validação do bean para email
        @Email(message = "E-mail inválido.")
        String email,
        @NotBlank(message = "O CPF não pode estar em branco.")
        //validação do bean para cpf
        @CPF(message = "CPF inválido.")
        String cpf,
        LocalDate dataNascimento
) {
}
