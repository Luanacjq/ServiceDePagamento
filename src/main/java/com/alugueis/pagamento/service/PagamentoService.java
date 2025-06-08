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

        pagamento.setNome(dto.getNome());
        pagamento.setNumero(dto.getNumero());
        pagamento.setValidade(dto.getValidade());
        pagamento.setCvv(dto.getCvv());
        pagamento.setCpf(dto.getCpf());
        pagamento.setEmail(dto.getEmail());

        pagamento = pagamentoRepository.save(pagamento);

        return PagamentoDTO.fromEntity(pagamento);
    }

    public List<PagamentoDTO> listarPagamentos() {
        return pagamentoRepository.findAll().stream()
            .map(PagamentoDTO::fromEntity)
            .collect(Collectors.toList());
    }

    public PagamentoDTO buscarPorId(Long id) {
        Pagamento pagamento = pagamentoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Pagamento não encontrado"));
        return PagamentoDTO.fromEntity(pagamento);
    }
}