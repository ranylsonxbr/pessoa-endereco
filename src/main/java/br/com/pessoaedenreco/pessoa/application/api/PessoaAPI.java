package br.com.pessoaedenreco.pessoa.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/pessoas")
public interface PessoaAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse criaPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);

}
