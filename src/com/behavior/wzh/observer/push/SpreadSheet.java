package com.behavior.wzh.observer.push;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("spreadSheet got update" + value);
    }
}
