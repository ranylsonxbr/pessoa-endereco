package br.com.pessoaedenreco.pessoa.service;


import br.com.pessoaedenreco.pessoa.application.api.ListaPessoasResponse;
import br.com.pessoaedenreco.pessoa.application.api.PessoaDetalhadaResponse;
import br.com.pessoaedenreco.pessoa.application.api.PessoaRequest;
import br.com.pessoaedenreco.pessoa.application.api.PessoaResponse;
import br.com.pessoaedenreco.pessoa.application.repository.PessoaRespository;
import br.com.pessoaedenreco.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {

    private final PessoaRespository pessoaRepository;

    @Override
    public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
        log.info("[start] PessoaApplicationService - criaPessoa");
        Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
        log.info("[finish] PessoaApplicationService - criaPessoa");
        return PessoaResponse.builder()
                .idPessoa(pessoa.getIdPessoa())
                .build();
    }

    @Override
    public List<ListaPessoasResponse> listaTodos() {
        log.info("[start] PessoaApplicationService - listaTodos");
        List<Pessoa> pessoas = pessoaRepository.listaTodos();
        log.info("[finish] PessoaApplicationService - listaTodos");
        return ListaPessoasResponse.converte(pessoas);
    }

    @Override
    public PessoaDetalhadaResponse buscaPorId(UUID idPessoa) {
        log.info("[start] PessoaApplicationService - buscaPorId");
        Pessoa pessoa = pessoaRepository.buscaPorId(idPessoa);
        log.info("[finish] PessoaApplicationService - buscaPorId");
        return new PessoaDetalhadaResponse(pessoa);
    }
}
