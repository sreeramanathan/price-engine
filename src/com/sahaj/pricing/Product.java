package com.sahaj.pricing;

public class Product {
    private String name;
    private int quantity;
    private double weight;
    private int unitPrice;
    private ProductCategory category;

    public Product(String name, int quantity, double weight, int unitPrice, ProductCategory category) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.unitPrice = unitPrice;
        this.category = category;
    }
}
