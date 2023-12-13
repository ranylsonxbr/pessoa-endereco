package br.com.pessoaedenreco.endereco.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idEndereco", updatable = false, unique = true, nullable = false)
    private UUID idEndereco;
    @NotNull
    @Column(columnDefinition = "uuid", name = "idPessoa", nullable = false)
    private UUID idPessoa;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String numero;
    @NotBlank
    private String cep;
    @NotBlank
    private String cidade;
    @NotNull
    private TipoEndereco tipoEndereco = TipoEndereco.PRINCIPAL;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

}
