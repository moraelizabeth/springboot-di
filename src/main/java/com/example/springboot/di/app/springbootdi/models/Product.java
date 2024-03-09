package com.example.springboot.di.app.springbootdi.models;

class Product {

    private Long id;
    private String name;
    private String price;

    public Product() {}
    public Product(Long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}