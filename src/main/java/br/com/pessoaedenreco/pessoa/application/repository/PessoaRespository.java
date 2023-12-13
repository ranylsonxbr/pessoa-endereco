package br.com.pessoaedenreco.pessoa.application.repository;

import br.com.pessoaedenreco.pessoa.application.api.ListaPessoasResponse;
import br.com.pessoaedenreco.pessoa.domain.Pessoa;

import java.util.List;

public interface PessoaRespository {
    Pessoa salva(Pessoa pessoa);


    List<Pessoa> listaTodos();
}
