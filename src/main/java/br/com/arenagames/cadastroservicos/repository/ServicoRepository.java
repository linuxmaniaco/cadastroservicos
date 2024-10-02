package br.com.arenagames.cadastroservicos.repository;

import br.com.arenagames.cadastroservicos.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
