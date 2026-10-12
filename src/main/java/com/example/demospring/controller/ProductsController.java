package com.example.demospring.controller;

import com.example.demospring.model.Products;
import com.example.demospring.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/products", "/produtos"})
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;

    @PostMapping
    public Products criar(@RequestBody Products product) {
        return productsRepository.save(product);
    }

    @GetMapping
    public List<Products> listarTodos() {
        return productsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Products buscarPorId(@PathVariable Long id) {
        return productsRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Products atualizar(@PathVariable Long id, @RequestBody Products product) {
        product.setId(id);
        return productsRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        productsRepository.deleteById(id);
    }
}
