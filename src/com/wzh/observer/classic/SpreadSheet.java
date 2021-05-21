package com.wzh.observer;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("spreadSheet got update");
    }
}
