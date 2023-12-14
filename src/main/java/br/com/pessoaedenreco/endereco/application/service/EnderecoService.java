package br.com.pessoaedenreco.endereco.application.service;


import br.com.pessoaedenreco.endereco.application.api.EnderecoRequest;
import br.com.pessoaedenreco.endereco.application.api.EnderecoResponse;
import br.com.pessoaedenreco.endereco.application.api.ListaEnderecosResponse;

import java.util.List;
import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);

    List<ListaEnderecosResponse> listaEnderecosDaPessoa(UUID idPessoa);
}
