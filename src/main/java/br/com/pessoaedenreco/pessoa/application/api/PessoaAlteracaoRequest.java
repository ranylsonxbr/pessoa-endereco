package br.com.pessoaedenreco.pessoa.application.api;

import lombok.Value;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Value
public class PessoaAlteracaoRequest {
    @NotBlank
    private String nomeCompleto;
    @NotNull
    private LocalDate dataDeNascimento;
}
