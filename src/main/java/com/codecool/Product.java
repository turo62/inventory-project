package com.codecool;

public abstract class Product {
    protected String name;
    protected int price;
    protected String type;
    protected int size;
    
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getType() {
        return type;
    }
    
    public int getSize() {
        return size;
    }
}
