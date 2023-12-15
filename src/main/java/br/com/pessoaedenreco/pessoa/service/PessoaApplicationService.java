package br.com.pessoaedenreco.pessoa.service;


import br.com.pessoaedenreco.endereco.application.infra.EnderecoInfraRepositoy;
import br.com.pessoaedenreco.endereco.application.repository.EnderecoRespository;
import br.com.pessoaedenreco.endereco.domain.Endereco;
import br.com.pessoaedenreco.endereco.domain.TipoEndereco;
import br.com.pessoaedenreco.pessoa.application.api.*;
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
    private final EnderecoRespository enderecoRepository;

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
        Endereco enderecoPrincipal = enderecoRepository.findEnderecoPrincipal(idPessoa, TipoEndereco.PRINCIPAL);
        log.info("[finish] PessoaApplicationService - buscaPorId");
        return new PessoaDetalhadaResponse(pessoa,enderecoPrincipal);
    }

    @Override
    public void altera(UUID idPessoa, PessoaAlteracaoRequest alteraPessoaRequest) {
        log.info("[start] PessoaApplicationService - altera");
        Pessoa pessoa = pessoaRepository.buscaPorId(idPessoa);
        pessoa.altera(alteraPessoaRequest);
        pessoaRepository.salva(pessoa);
        log.info("[finish] PessoaApplicationService - altera");
    }

    @Override
    public void deletaPessoaPorId(UUID idPessoa) {
        log.info("[start] PessoaApplicationService - deletaPessoaPorId");
        Pessoa pessoa = pessoaRepository.buscaPorId(idPessoa);
        pessoaRepository.deletaPessoa(pessoa);
        log.info("[finish] PessoaApplicationService - deletaPessoaPorId");

    }
}
