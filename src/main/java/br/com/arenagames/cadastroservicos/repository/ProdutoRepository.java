package br.com.arenagames.cadastroservicos.repository;

import br.com.arenagames.cadastroservicos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
