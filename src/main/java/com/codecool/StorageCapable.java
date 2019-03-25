package com.codecool;

import java.util.List;

public interface StorageCapable {
    
    public List<Product> getAllProduct();
    
    public void StoreCDProduct(String name, int price, int numOfTracks);
    
    public void StoreBookProduct(String name, int price, int numOfPages);
}
