package com.alugueis.pagamento.controller;

import com.alugueis.pagamento.dto.PagamentoDTO;
import com.alugueis.pagamento.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public PagamentoDTO criar(@RequestBody PagamentoDTO dto) {
        return pagamentoService.criarPagamento(dto);
    }

    @GetMapping("/listar")
    public List<PagamentoDTO> listar() {
        return pagamentoService.listarPagamentos();
    }
}