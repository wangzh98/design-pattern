package com.behavior.wzh.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("slection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
