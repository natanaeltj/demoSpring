package com.example.demospring.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate clientDesde;

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public LocalDate getClienteDesde() {
        return clientDesde;
    }

    public void setClienteDesde(LocalDate clienteDesde) {
        this.clientDesde = clienteDesde;
    }

    public LocalDate getClientDesde() {
        return clientDesde;
    }

    public void setClientDesde(LocalDate clientDesde) {
        this.clientDesde = clientDesde;
    }
}
