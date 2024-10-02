package br.com.arenagames.cadastroservicos.controller;

import br.com.arenagames.cadastroservicos.model.Produto;
import br.com.arenagames.cadastroservicos.model.Servico;
import br.com.arenagames.cadastroservicos.service.CadastroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
@RequiredArgsConstructor
public class CadastroController {
    private final CadastroService cadastroService;

    @PostMapping("/produto")
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto) {
        Produto produtoSalvo = cadastroService.cadastrarProduto(produto);
        return ResponseEntity.ok(produtoSalvo);
    }

    @PostMapping("/servico")
    public ResponseEntity<Servico> cadastrarServico(@RequestBody Servico servico) {
        Servico servicoSalvo = cadastroService.cadastrarServico(servico);
        return ResponseEntity.ok(servicoSalvo);
    }

    @DeleteMapping("/servico/{id}")
    public ResponseEntity<Void> excluirServico(@PathVariable Long id) {
        cadastroService.excluirServico(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/total")
    public ResponseEntity<Double> calcularTotal() {
        double total = cadastroService.calcularTotalProdutos() + cadastroService.calcularTotalServicos();
        return ResponseEntity.ok(total);
    }
}
