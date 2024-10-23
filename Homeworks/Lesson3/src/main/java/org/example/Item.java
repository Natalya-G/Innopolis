package org.example;

public class Item {
    String name;
    String article;
    double price;
    int quantity;

    public Item(String name, String article, int quantity) {
        this.name = name;
        this.article = article;
        this.quantity = quantity;
    }

    public Item(String name, String article, int quantity, double price) {
        this.name = name;
        this.article = article;
        this.quantity = quantity;
        this.price = price;
    }
}
