package br.com.pessoaedenreco.endereco.application.infra;

import br.com.pessoaedenreco.endereco.application.repository.EnderecoRespository;
import br.com.pessoaedenreco.endereco.domain.Endereco;
import br.com.pessoaedenreco.endereco.domain.TipoEndereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EnderecoInfraRepositoy implements EnderecoRespository {

    private final EnderecoSpringDataJPA enderecoSpringDataJPA;

    @Override
    public Endereco salva(Endereco endereco) {
        log.info("[start] EnderecoInfraRepositoy - salva");
        enderecoSpringDataJPA.save(endereco);
        log.info("[finish] EnderecoInfraRepositoy - salva");
        return endereco;
    }

    @Override
    public List<Endereco> listaEnderecosDaPessoa(UUID idPessoa) {
        log.info("[start] EnderecoInfraRepositoy - listaEnderecosDaPessoa");
        List<Endereco> enderecos = enderecoSpringDataJPA.findAll();
        log.info("[finish] EnderecoInfraRepositoy - listaEnderecosDaPessoa");
        return enderecos;
    }

    @Override
    public Endereco findEnderecoPrincipal(UUID idPessoa, TipoEndereco principal) {
        log.info("[inicia] EnderecoInfraRepository - findEnderecoPrincipal");
        Endereco endereco = enderecoSpringDataJPA.findByIdPessoaAndTipoEndereco(idPessoa, principal);
        log.info("[finaliza] EnderecoInfraRepository - findEnderecoPrincipal");
        return endereco;
    }
}
