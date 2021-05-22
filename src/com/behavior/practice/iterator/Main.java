package com.behavior.practice.iterator;

public class Main {
    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1,"car"));
        productCollection.add(new Product(2,"house"));
        productCollection.add(new Product(3,"boat"));
        productCollection.add(new Product(4,"phone"));
        Iterator iterator = productCollection.creatIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
