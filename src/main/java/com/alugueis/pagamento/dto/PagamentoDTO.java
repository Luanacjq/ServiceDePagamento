package com.alugueis.pagamento.dto;

import java.time.LocalDateTime;

import com.alugueis.pagamento.model.Pagamento;

public class PagamentoDTO {
    private Long id;
    private Integer valor;
    private String metodo;
    private LocalDateTime dataPagamento;

    private String nome;
    private String numero;
    private String validade;
    private String cvv;
    private String cpf;
    private String email;

    // getters e setters para os novos campos
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
    // Atualize o método fromEntity para preencher os campos novos
    public static PagamentoDTO fromEntity(Pagamento pagamento) {
        PagamentoDTO dto = new PagamentoDTO();
        dto.setId(pagamento.getId());
        dto.setValor(pagamento.getValor());
        dto.setMetodo(pagamento.getMetodo());
        dto.setDataPagamento(pagamento.getDataPagamento());

        dto.setNome(pagamento.getNome());
        dto.setNumero(pagamento.getNumero());
        dto.setValidade(pagamento.getValidade());
        dto.setCvv(pagamento.getCvv());
        dto.setCpf(pagamento.getCpf());
        dto.setEmail(pagamento.getEmail());

        return dto;
    }
}
