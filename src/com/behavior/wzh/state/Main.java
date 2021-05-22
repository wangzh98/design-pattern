package com.behavior.wzh.state;

public class Main {
    public static void main(String[] args) {
        // open closed principle
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
