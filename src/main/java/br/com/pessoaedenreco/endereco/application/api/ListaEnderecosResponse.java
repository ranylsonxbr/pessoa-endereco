package br.com.pessoaedenreco.endereco.application.api;

import br.com.pessoaedenreco.endereco.domain.Endereco;
import br.com.pessoaedenreco.endereco.domain.TipoEndereco;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ListaEnderecosResponse {
    private UUID idEndereco;
    private String logradouro;
    private String numero;
    private String cep;
    private String cidade;
    private TipoEndereco tipoEndereco;

    public ListaEnderecosResponse(Endereco endereco) {
        this.idEndereco = endereco.getIdEndereco();
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
        this.tipoEndereco = endereco.getTipoEndereco();
    }

    public static List<ListaEnderecosResponse> converte(List<Endereco> enderecos) {
        return enderecos.stream()
                .map(ListaEnderecosResponse::new)
                .collect(Collectors.toList());
    }
}

