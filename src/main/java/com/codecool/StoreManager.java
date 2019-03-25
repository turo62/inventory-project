package com.codecool;

import java.util.List;

public class StoreManager implements StorageCapable{
    protected StorageCapable storage;
    
    
    public StoreManager() {
    }
    
    public void addCDProduct(String name, int price, int numOfTracks) {
        storage.StoreBookProduct(name, price, numOfTracks);
    }
    
    public void addBookProduct(String name, int price, int numOfPages) {
        storage.StoreBookProduct(name, price, numOfPages);
    }
    
    public void addStorage(StorageCapable storage) {
        this.storage = storage;
    }
}
