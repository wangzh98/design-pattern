package com.wzh.observer.pull;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver() {
        observers.remove(observers);
    }

    public void notifyObserver(int value) {
        for (Observer observer: observers) {
            observer.update(value);
        }
    }
}
