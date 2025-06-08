package com.alugueis.pagamento.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "pagamentos")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bd_valor")
    private Integer valor;

    @Column(name = "te_metodo")
    private String metodo;

    @Column(name = "dt_data")
    private LocalDateTime dataPagamento;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getValor() { return valor; }
    public void setValor(Integer valor) { this.valor = valor; }

    public String getMetodo() { return metodo; }
    public void setMetodo(String metodo) { this.metodo = metodo; }

    public LocalDateTime getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(LocalDateTime dataPagamento) { this.dataPagamento = dataPagamento; }

    @Override
    public String toString() {
        return "Pagamento [id=" + id + 
        ", valor=" + valor + 
        ", metodo=" + metodo + 
        ", dataPagamento=" + dataPagamento
                + "]";
    }

}