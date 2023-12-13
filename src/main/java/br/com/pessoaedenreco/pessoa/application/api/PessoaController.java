package br.com.pessoaedenreco.pessoa.application.api;

import br.com.pessoaedenreco.pessoa.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PessoaController implements PessoaAPI {

    private final PessoaService pessoaService;

    @Override
    public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
        log.info("[start] PessoaController - criaPessoa");
        PessoaResponse pessoaCriada = pessoaService.criaPessoa(pessoaRequest);
        log.info("[finish] PessoaController - criaPessoa");
        return pessoaCriada;
    }

    @Override
    public List<ListaPessoasResponse> getTodasPessoas() {
        log.info("[start] PessoaController - criaPessoa");
        List<ListaPessoasResponse> pessoas = pessoaService.listaTodos();
        log.info("[finish] PessoaController - criaPessoa");
        return pessoas;
    }
}
