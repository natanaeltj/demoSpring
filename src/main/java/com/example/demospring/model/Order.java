package com.example.demospring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clientId;

    private Long productId;

    private Integer amount;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getClienteId() {
        return clientId;
    }

    public void setClienteId(Long clienteId) {
        this.clientId = clienteId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProdutoId() {
        return productId;
    }

    public void setProdutoId(Long produtoId) {
        this.productId = produtoId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getQuantidade() {
        return amount;
    }

    public void setQuantidade(Integer quantidade) {
        this.amount = quantidade;
    }
}
