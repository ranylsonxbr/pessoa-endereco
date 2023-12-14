package br.com.pessoaedenreco.endereco.application.api;

import br.com.pessoaedenreco.endereco.application.service.EnderecoService;
import br.com.pessoaedenreco.pessoa.application.api.PessoaRequest;
import br.com.pessoaedenreco.pessoa.application.api.PessoaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @Override
    public List<ListaEnderecosResponse> listaEnderecosDaPessoa(UUID idPessoa) {
        log.info("[start] EnderecoController - listaEnderecosDaPessoa");
        List<ListaEnderecosResponse> enderecos = enderecoService.listaEnderecosDaPessoa(idPessoa);
        log.info("[finish] EnderecoController - listaEnderecosDaPessoa");
        return enderecos;
    }
}
