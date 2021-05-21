package com.wzh.observer.pull;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("spreadSheet got update" + value);
    }
}
