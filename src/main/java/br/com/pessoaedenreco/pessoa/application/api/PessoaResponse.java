package br.com.pessoaedenreco.pessoa.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class PessoaResponse {
    private UUID idPessoa;
}
