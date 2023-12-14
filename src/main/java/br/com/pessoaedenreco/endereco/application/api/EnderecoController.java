package br.com.pessoaedenreco.endereco.application.api;

import br.com.pessoaedenreco.endereco.application.service.EnderecoService;
import br.com.pessoaedenreco.pessoa.application.api.PessoaRequest;
import br.com.pessoaedenreco.pessoa.application.api.PessoaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequiredArgsConstructor
public class EnderecoController implements EnderecoAPI {

    private final EnderecoService enderecoService;

    @Override
    public EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        log.info("[start] EnderecoController - criaEndereco");
        EnderecoResponse enderecoCriado = enderecoService.criaEndereco(idPessoa,enderecoRequest);
        log.info("[finish] EnderecoController - criaEndereco");
        return enderecoCriado;
    }
}
