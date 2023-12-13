package br.com.pessoaedenreco.pessoa.service;


import br.com.pessoaedenreco.pessoa.application.api.*;

import java.util.List;
import java.util.UUID;

public interface PessoaService {

    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

    List<ListaPessoasResponse> listaTodos();

    PessoaDetalhadaResponse buscaPorId(UUID idPessoa);

    void altera(UUID idPessoa, PessoaAlteracaoRequest alteraPessoaRequest);
}
