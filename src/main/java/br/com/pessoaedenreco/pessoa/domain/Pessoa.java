package br.com.pessoaedenreco.pessoa.domain;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idPessoa", updatable = false, unique = true, nullable = false)
    private UUID idPessoa;
    @NotBlank
    private String nomeCompleto;
    @NotNull
    private LocalDate dataDeNascimento;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

}
