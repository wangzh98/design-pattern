package com.behavior.practice.template;

public abstract class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        doBefore();
        System.out.println("Removing the window from the screen");
        doAfter();
        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }

    protected abstract void doBefore();

    protected abstract void doAfter();

}
