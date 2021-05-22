package com.behavior.practice.memento;

public class Demo {
  public static void show() {
    Document document = new Document();
    History history = new History();

    document.setContent("Hello");
    history.push(document.createMemento());

    document.setFontName("Font 1");
    history.push(document.createMemento());

    document.setFontSize(10);

    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);
  }

  public static void main(String[] args) {
    show();
  }
}
