package br.com.pessoaedenreco.endereco.application.infra;

import br.com.pessoaedenreco.endereco.application.repository.EnderecoRespository;
import br.com.pessoaedenreco.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

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
}
