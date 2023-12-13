package br.com.pessoaedenreco.pessoa.service;


import br.com.pessoaedenreco.pessoa.application.api.ListaPessoasResponse;
import br.com.pessoaedenreco.pessoa.application.api.PessoaRequest;
import br.com.pessoaedenreco.pessoa.application.api.PessoaResponse;

import java.util.List;

public interface PessoaService {

    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

    List<ListaPessoasResponse> listaTodos();
}
