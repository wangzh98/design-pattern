package com.behavior.wzh.strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("b&w filter");
    }
}
