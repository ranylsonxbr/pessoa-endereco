package br.com.pessoaedenreco.pessoa.service;


import br.com.pessoaedenreco.pessoa.application.api.ListaPessoasResponse;
import br.com.pessoaedenreco.pessoa.application.api.PessoaDetalhadaResponse;
import br.com.pessoaedenreco.pessoa.application.api.PessoaRequest;
import br.com.pessoaedenreco.pessoa.application.api.PessoaResponse;

import java.util.List;
import java.util.UUID;

public interface PessoaService {

    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

    List<ListaPessoasResponse> listaTodos();

    PessoaDetalhadaResponse buscaPorId(UUID idPessoa);
}
