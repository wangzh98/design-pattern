package com.behavior.practice.state;

public class Transit implements MyTravelMode {
    @Override
    public Object getEta() {
        System.out.println("calculate eta transit");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("calculate direction transit");
        return 3;
    }
}
