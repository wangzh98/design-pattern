package com.structure.proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (String filename: fileNames) {
            library.add(new Ebook(filename));
        }

        library.openEbook("a");
    }
}
