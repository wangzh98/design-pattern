package com.behavior.wzh.strategy;

public class ImageStorage {
    // open close principle
    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
