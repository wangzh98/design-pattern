package com.behavior.wzh.command;

import com.behavior.wzh.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
