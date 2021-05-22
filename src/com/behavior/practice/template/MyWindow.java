package com.behavior.practice.template;

public class MyWindow extends Window {
    @Override
    protected void doBefore() {
        System.out.println("do before close");
    }

    @Override
    protected void doAfter() {
        System.out.println("do after close");
    }
}
