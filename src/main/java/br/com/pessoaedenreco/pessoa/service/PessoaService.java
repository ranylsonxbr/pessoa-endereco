package br.com.pessoaedenreco.pessoa.service;

import br.com.pessoaedenreco.pessoa.application.PessoaRequest;
import br.com.pessoaedenreco.pessoa.application.PessoaResponse;

public interface PessoaService {

    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);
}
