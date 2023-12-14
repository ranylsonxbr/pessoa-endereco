package br.com.pessoaedenreco.endereco.application.service;


import br.com.pessoaedenreco.endereco.application.api.EnderecoRequest;
import br.com.pessoaedenreco.endereco.application.api.EnderecoResponse;

import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);
}
