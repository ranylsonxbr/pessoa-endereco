package br.com.pessoaedenreco.endereco.application.service;

import br.com.pessoaedenreco.endereco.application.api.EnderecoRequest;
import br.com.pessoaedenreco.endereco.application.api.EnderecoResponse;
import br.com.pessoaedenreco.endereco.application.repository.EnderecoRespository;
import br.com.pessoaedenreco.endereco.domain.Endereco;
import br.com.pessoaedenreco.pessoa.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService {
    private final PessoaService pessoaService;
    private final EnderecoRespository enderecoRespository;

    @Override
    public EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        log.info("[start] EnderecoApplicationService - criaEndereco");
        pessoaService.buscaPorId(idPessoa);
        Endereco endereco = enderecoRespository.salva(new Endereco(idPessoa,enderecoRequest));
        log.info("[start] EnderecoApplicationService - criaEndereco");
        return EnderecoResponse.builder()
                .idEndereco(endereco.getIdEndereco())
                .build();
    }
}
