package com.behavior.wzh.iterator;

public class Main {
    public static void main(String[] args) {
        // single repository principle
        BrowseHistory history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            String current = iterator.current();
            System.out.println(current);
            iterator.next();
        }

    }
}
