package com.wzh.command.fx;

import com.wzh.command.BlackAndWhiteCommand;
import com.wzh.command.CompositeCommand;
import com.wzh.command.ResizeCommand;

public class Main2 {
    public static void main(String[] args) {
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BlackAndWhiteCommand());
        compositeCommand.execute();
        compositeCommand.execute();
    }
}
