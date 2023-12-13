package br.com.pessoaedenreco.pessoa.infra;

import br.com.pessoaedenreco.pessoa.application.api.ListaPessoasResponse;
import br.com.pessoaedenreco.pessoa.application.repository.PessoaRespository;
import br.com.pessoaedenreco.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PessoaInfraRespository implements PessoaRespository {

    private final PessoaSpringDataJPARespository pessoaSpringDataJPARespository;

    @Override
    public Pessoa salva(Pessoa pessoa) {
        log.info("[start] PessoaInfraRespository - salva");
        pessoaSpringDataJPARespository.save(pessoa);
        log.info("[finish] PessoaInfraRespository - salva");
        return pessoa;
    }

    @Override
    public List<Pessoa> listaTodos() {
        log.info("[start] PessoaInfraRespository - listaTodos");
        List<Pessoa> todasPessoas = pessoaSpringDataJPARespository.findAll();
        log.info("[finish] PessoaInfraRespository - listaTodos");
        return todasPessoas;
    }

}
