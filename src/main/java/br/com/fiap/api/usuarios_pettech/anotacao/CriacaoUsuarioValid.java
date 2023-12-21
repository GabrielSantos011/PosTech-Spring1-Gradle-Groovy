package br.com.fiap.api.usuarios_pettech.anotacao;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//utilizada em uma classe
@Target(ElementType.TYPE)
//em tempo de execução
@Retention(RetentionPolicy.RUNTIME)
//qual classe faz a validação
@Constraint(validatedBy = CriacaoUsuarioValidator.class)
public @interface CriacaoUsuarioValid {
    //padrão para todas interfaces

    String message() default "Validation Error";

    Class<?> [] groups() default {};

    Class<? extends Payload> [] payload() default {};

}
