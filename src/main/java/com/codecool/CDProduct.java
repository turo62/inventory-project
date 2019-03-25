package com.codecool;

public class CDProduct extends Product {
    
    private int numOfTracks;
    
    public CDProduct(String name, int price, int size) {
        super(name, price);
        this.numOfTracks = size;
        super.type = "CD";
    }
    
    @Override
    public int getSize() {
        return numOfTracks;
    }
    
    @Override
    public String toString() {
        return "CD {" +
                "Title of CD: " + name +
                ", price ($): " + price +
                ", number of tracks: " + numOfTracks +
                "}";
            
    }
}
