package br.com.pessoaedenreco.endereco.application.repository;

import br.com.pessoaedenreco.endereco.domain.Endereco;

import java.util.List;
import java.util.UUID;

public interface EnderecoRespository {
    Endereco salva(Endereco endereco);

    List<Endereco> listaEnderecosDaPessoa(UUID idPessoa);
}
