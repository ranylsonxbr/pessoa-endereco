package br.com.pessoaedenreco.pessoa.service;

import br.com.pessoaedenreco.pessoa.application.PessoaRequest;
import br.com.pessoaedenreco.pessoa.application.PessoaResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PessoaApplicationService implements PessoaService {
    @Override
    public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
        log.info("[start] PessoaApplicationService - criaPessoa");

        log.info("[finish] PessoaApplicationService - criaPessoa");
        return null;
    }
}
