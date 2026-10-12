package com.example.demospring.controller;

import com.example.demospring.model.Client;
import com.example.demospring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/clients", "/clientes"})
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping
    public Client criar(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    @GetMapping
    public List<Client> listarTodos() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client buscarPorId(@PathVariable Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Client atualizar(@PathVariable Long id, @RequestBody Client client) {
        client.setId(id);
        return clientRepository.save(client);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clientRepository.deleteById(id);
    }
}
