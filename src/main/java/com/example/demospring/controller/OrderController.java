package com.example.demospring.controller;

import com.example.demospring.model.Order;
import com.example.demospring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/orders", "/pedidos"})
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Order criar(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> listarTodos() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order buscarPorId(@PathVariable Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Order atualizar(@PathVariable Long id, @RequestBody Order order) {
        order.setId(id);
        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        orderRepository.deleteById(id);
    }
}
