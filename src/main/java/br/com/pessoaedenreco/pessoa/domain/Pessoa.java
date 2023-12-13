package br.com.pessoaedenreco.pessoa.domain;

import br.com.pessoaedenreco.pessoa.application.api.PessoaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Pessoa {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idPessoa;
    @NotBlank
    private String nomeCompleto;
    @NotNull
    private LocalDate dataDeNascimento;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Pessoa(PessoaRequest pessoaRequest) {
        this.nomeCompleto = pessoaRequest.getNomeCompleto();
        this.dataDeNascimento = pessoaRequest.getDataDeNascimento();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
