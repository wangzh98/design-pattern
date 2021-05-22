package com.behavior.wzh.command.editor;

import java.util.Deque;
import java.util.LinkedList;

public class History {
    private Deque<UndoableCommand> commands = new LinkedList<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
