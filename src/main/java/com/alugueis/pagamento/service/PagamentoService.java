package com.alugueis.pagamento.service;
import com.alugueis.pagamento.dto.PagamentoDTO;
import com.alugueis.pagamento.model.Pagamento;
import com.alugueis.pagamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public PagamentoDTO criarPagamento(PagamentoDTO dto) {
    Pagamento pagamento = new Pagamento();
    pagamento.setValor(dto.getValor());
    pagamento.setMetodo(dto.getMetodo());
    pagamento.setDataPagamento(LocalDateTime.now());

    pagamento = pagamentoRepository.save(pagamento);

    PagamentoDTO resposta = new PagamentoDTO();
    resposta.setId(pagamento.getId());
    resposta.setValor(pagamento.getValor());
    resposta.setMetodo(pagamento.getMetodo());
    resposta.setDataPagamento(pagamento.getDataPagamento());

    return resposta;
    }

    public List<PagamentoDTO> listarPagamentos() {
        return pagamentoRepository.findAll().stream().map(pagamento -> {
            PagamentoDTO dto = new PagamentoDTO();
            dto.setId(pagamento.getId());
            dto.setValor(pagamento.getValor());
            dto.setMetodo(pagamento.getMetodo());
            dto.setDataPagamento(pagamento.getDataPagamento());
            return dto;
        }).collect(Collectors.toList());
    }
}