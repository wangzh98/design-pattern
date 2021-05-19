package com.wzh;

import com.wzh.memento.Editor;
import com.wzh.memento.History;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");

        editor.setContent("b");
        editor.setContent("c");
//        editor.undo();

    }
}
