package com.academia.professores.demo.entity;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Getter
@Setter
@Validated
@NotNull(message = "professor is required")
@Document(collection = "professor")
public class Professor {

    @Transient
    public static final String SEQUENCE_NAME = "professor_sequence";

    @Id
    private long id;

    @NotEmpty(message = "nome is required")
    private String nome;

    @NotEmpty(message = "sexo is required")
    private String sexo;

    @NotEmpty(message = "escala is required")
    private String escala;

}
