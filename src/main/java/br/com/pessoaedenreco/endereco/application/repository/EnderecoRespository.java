package br.com.pessoaedenreco.endereco.application.repository;

import br.com.pessoaedenreco.endereco.domain.Endereco;
import br.com.pessoaedenreco.endereco.domain.TipoEndereco;

import java.util.List;
import java.util.UUID;

public interface EnderecoRespository {
    Endereco salva(Endereco endereco);
    Endereco findEnderecoPrincipal(UUID idPessoa, TipoEndereco principal);
    List<Endereco> listaEnderecosDaPessoa(UUID idPessoa);
}
