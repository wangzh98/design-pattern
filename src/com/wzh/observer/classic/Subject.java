package com.wzh.observer;

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

    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
