package com.codecool;

public class BookProduct extends Product {
    private int numOfPages;
    
    
    public BookProduct(String name,int price, int size){
        super(name, price);
        this.numOfPages = size;
        super.type = "book";
    }
    
    @Override
    public int getSize() {
        return numOfPages;
    }
    
    @Override
    public String toString() {
        return "Book {" +
            "Title of book: " + name +
            ", price ($): " + price +
            ", number of pages: " + numOfPages +
            "}";
        
    }
}


