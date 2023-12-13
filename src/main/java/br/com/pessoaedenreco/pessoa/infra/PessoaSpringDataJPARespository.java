package br.com.pessoaedenreco.pessoa.infra;

import br.com.pessoaedenreco.pessoa.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaSpringDataJPARespository extends JpaRepository<Pessoa, UUID> {
}
