package br.com.pessoaedenreco.pessoa.application.api;

import br.com.pessoaedenreco.endereco.domain.Endereco;
import br.com.pessoaedenreco.pessoa.domain.Pessoa;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class PessoaDetalhadaResponse {

    private UUID idPessoa;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;
    private Endereco enderecoPrincipal;

    public PessoaDetalhadaResponse(Pessoa pessoa, Endereco enderecoPrincipal) {
        this.idPessoa = pessoa.getIdPessoa();
        this.nomeCompleto = pessoa.getNomeCompleto();
        this.dataDeNascimento = pessoa.getDataDeNascimento();
        this.enderecoPrincipal = enderecoPrincipal;
    }

}
