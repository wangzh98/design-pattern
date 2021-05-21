package com.wzh.observer.classic;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("spreadSheet got update");
    }
}
