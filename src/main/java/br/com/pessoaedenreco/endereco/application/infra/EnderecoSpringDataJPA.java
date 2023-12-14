package br.com.pessoaedenreco.endereco.application.infra;


import br.com.pessoaedenreco.endereco.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoSpringDataJPA extends JpaRepository<Endereco, UUID> {
}
