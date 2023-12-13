package br.com.pessoaedenreco.pessoa.service;


import br.com.pessoaedenreco.pessoa.application.api.PessoaRequest;
import br.com.pessoaedenreco.pessoa.application.api.PessoaResponse;

public interface PessoaService {

    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);
}
