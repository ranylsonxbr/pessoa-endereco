package br.com.pessoaedenreco.pessoa.application;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Value
public class PessoaRequest {

    @NotBlank
    private String nomeCompleto;
    @NotNull
    private LocalDate dataDeNascimento;
}
