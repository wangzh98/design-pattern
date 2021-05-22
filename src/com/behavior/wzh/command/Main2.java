package com.behavior.wzh.command;

public class Main2 {
    public static void main(String[] args) {
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BlackAndWhiteCommand());
        compositeCommand.execute();
        compositeCommand.execute();
    }
}
