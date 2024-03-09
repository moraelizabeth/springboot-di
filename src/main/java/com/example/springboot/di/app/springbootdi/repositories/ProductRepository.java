package com.example.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import com.example.springboot.di.app.springbootdi.models.Product;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Memoria Corsair 32GB", 300L),
            new Product(2L, "Monitor Acer 24 pulgadas", 200L),
            new Product(3L, "Teclado mecánico Logitech", 100L),
            new Product(4L, "Mouse inalámbrico Microsoft", 50L),
            new Product(5L, "Disco duro externo Seagate 1TB", 80L),
            new Product(6L, "Auriculares Sony con cancelación de ruido", 150L),
            new Product(7L, "Impresora multifunción HP", 120L),
            new Product(8L, "Router inalámbrico TP-Link", 40L),
            new Product(9L, "Cámara web Logitech HD", 60L),
            new Product(10L, "Altavoces Bluetooth JBL", 90L)
        );
    }
}
