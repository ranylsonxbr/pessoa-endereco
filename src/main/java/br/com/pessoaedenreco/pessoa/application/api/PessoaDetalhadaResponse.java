package br.com.pessoaedenreco.pessoa.application.api;

import br.com.pessoaedenreco.pessoa.domain.Pessoa;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class PessoaDetalhadaResponse {

    private UUID idPessoa;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;

    public PessoaDetalhadaResponse(Pessoa pessoa) {
        this.idPessoa = pessoa.getIdPessoa();
        this.nomeCompleto = pessoa.getNomeCompleto();
        this.dataDeNascimento = pessoa.getDataDeNascimento();
    }

}
