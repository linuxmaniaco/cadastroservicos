package br.com.arenagames.cadastroservicos.service;

import br.com.arenagames.cadastroservicos.model.Produto;
import br.com.arenagames.cadastroservicos.model.Servico;
import br.com.arenagames.cadastroservicos.repository.ProdutoRepository;
import br.com.arenagames.cadastroservicos.repository.ServicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RelatorioService {
    private final ProdutoRepository produtoRepository;
    private final ServicoRepository servicoRepository;

    public List<Produto> gerarRelatorioProdutos() {
        return produtoRepository.findAll();
    }

    public List<Servico> gerarRelatorioServicos() {
        return servicoRepository.findAll();
    }
}
