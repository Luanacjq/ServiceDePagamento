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

    // NOVOS CAMPOS
    @Column(name = "te_nome")
    private String nome;

    @Column(name = "te_numero")
    private String numero;

    @Column(name = "te_validade")
    private String validade;

    @Column(name = "te_cvv")
    private String cvv;

    @Column(name = "te_cpf")
    private String cpf;

    @Column(name = "te_email")
    private String email;

    // getters e setters para esses campos novos

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getValidade() { return validade; }
    public void setValidade(String validade) { this.validade = validade; }

    public String getCvv() { return cvv; }
    public void setCvv(String cvv) { this.cvv = cvv; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

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