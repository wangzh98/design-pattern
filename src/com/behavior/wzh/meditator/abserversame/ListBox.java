package com.behavior.wzh.meditator.abserversame;

public class ListBox extends UIControl {
    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        super.notifyEventHandlers();
    }
}
