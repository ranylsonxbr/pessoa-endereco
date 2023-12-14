package br.com.pessoaedenreco.pessoa.application.repository;

import br.com.pessoaedenreco.pessoa.domain.Pessoa;

import java.util.List;
import java.util.UUID;

public interface PessoaRespository {
    Pessoa salva(Pessoa pessoa);

    List<Pessoa> listaTodos();

    Pessoa buscaPorId(UUID idPessoa);

    void deletaPessoa(Pessoa pessoa);
}
