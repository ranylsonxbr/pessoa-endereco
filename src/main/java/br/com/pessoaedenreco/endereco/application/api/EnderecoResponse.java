package br.com.pessoaedenreco.endereco.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class EnderecoResponse {
    private UUID idEndereco;
}
