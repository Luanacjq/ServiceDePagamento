package com.alugueis.pagamento.dto;

import java.time.LocalDateTime;

public class PagamentoDTO {
    private Long id;
    private Integer valor;
    private String metodo;
    private LocalDateTime dataPagamento;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getValor() { return valor; }
    public void setValor(Integer valor) { this.valor = valor; }

    public String getMetodo() { return metodo; }
    public void setMetodo(String metodo) { this.metodo = metodo; }

    public LocalDateTime getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(LocalDateTime dataPagamento) { this.dataPagamento = dataPagamento; }
}
