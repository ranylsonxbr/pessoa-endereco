package br.com.pessoaedenreco.pessoa.infra;

import br.com.pessoaedenreco.pessoa.application.repository.PessoaRespository;
import br.com.pessoaedenreco.pessoa.domain.Pessoa;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class PessoaInfraRespository implements PessoaRespository {
    @Override
    public Pessoa salva(Pessoa pessoa) {
        log.info("[start] PessoaInfraRespository - salva");
        log.info("[finish] PessoaInfraRespository - salva");
        return pessoa;
    }
}
