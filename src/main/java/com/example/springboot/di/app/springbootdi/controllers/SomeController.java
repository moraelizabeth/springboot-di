package com.example.springboot.di.app.springbootdi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.di.app.springbootdi.models.Product;
import com.example.springboot.di.app.springbootdi.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductService productService = new ProductService();

    @GetMapping
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
       return productService.findById(id);
    }
    
}
