package com.behavior.practice.state;

public class DirectionService {
    private MyTravelMode travelMode;

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public MyTravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(MyTravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public DirectionService(MyTravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
