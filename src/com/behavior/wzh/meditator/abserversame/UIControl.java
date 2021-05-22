package com.behavior.wzh.meditator.abserversame;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    // observer 来帮助执行命令
    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (EventHandler observer: eventHandlers) {
            observer.handle();
        }
    }

}
