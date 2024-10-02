package br.com.arenagames.cadastroservicos.service;

import br.com.arenagames.cadastroservicos.model.Produto;
import br.com.arenagames.cadastroservicos.model.Servico;
import br.com.arenagames.cadastroservicos.repository.ProdutoRepository;
import br.com.arenagames.cadastroservicos.repository.ServicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroService {

    private final ProdutoRepository produtoRepository;
    private final ServicoRepository servicoRepository;

    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Servico cadastrarServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public void excluirServico(Long id) {
        servicoRepository.deleteById(id);
    }

    public double calcularTotalProdutos() {
        return produtoRepository.findAll().stream().mapToDouble(Produto::getValor).sum();
    }

    public double calcularTotalServicos() {
        return servicoRepository.findAll().stream().mapToDouble(Servico::getValor).sum();
    }
}
