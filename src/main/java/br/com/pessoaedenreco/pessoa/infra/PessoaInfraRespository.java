package br.com.pessoaedenreco.pessoa.infra;

import br.com.pessoaedenreco.handler.APIException;
import br.com.pessoaedenreco.pessoa.application.api.ListaPessoasResponse;
import br.com.pessoaedenreco.pessoa.application.repository.PessoaRespository;
import br.com.pessoaedenreco.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    @Override
    public Pessoa buscaPorId(UUID idPessoa) {
        log.info("[start] PessoaInfraRespository - buscaPorId");
        Pessoa pessoa = pessoaSpringDataJPARespository.findById(idPessoa)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pessoa não encontrada"));
        log.info("[start] PessoaInfraRespository - buscaPorId");
        return pessoa;
    }

}
