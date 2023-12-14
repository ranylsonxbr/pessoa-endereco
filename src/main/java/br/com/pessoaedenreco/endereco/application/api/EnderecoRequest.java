package br.com.pessoaedenreco.endereco.application.api;

import br.com.pessoaedenreco.endereco.domain.TipoEndereco;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Value
public class EnderecoRequest {
    @NotBlank
    private String logradouro;
    private String numero;
    @NotBlank
    private String cep;
    @NotBlank
    private String cidade;
    @NotNull
    private TipoEndereco tipoEndereco = TipoEndereco.PRINCIPAL;

}
