package com.behavior.wzh.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
