package com.behavior.practice.state;

public class Main {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Driving());
        directionService.getDirection();
        directionService.getEta();
    }
}
