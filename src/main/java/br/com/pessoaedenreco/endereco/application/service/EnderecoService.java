package br.com.pessoaedenreco.endereco.application.service;


import br.com.pessoaedenreco.endereco.application.api.EnderecoRequest;
import br.com.pessoaedenreco.endereco.application.api.EnderecoResponse;

public interface EnderecoService {
    EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest);
}
