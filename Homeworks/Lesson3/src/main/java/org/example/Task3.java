package org.example;

public class Task3 {
    public static void main(String[] args) {
        Item item1 = new Item("стол","арт1",1);
        Item item2 = new Item("стул","арт2", 4, 499.99);
        Item item3 = new Item("кровать","арт3", 4);
        Item item4 = new Item("диван","арт4", 1, 49999.99);
        Item item5 = new Item("кресло","арт5", 1, 9999.99);

        System.out.println("Название: " + item1.name + ", артикул: " + item1.article + ", количество: " + item1.quantity + ", цена: " + item1.price);
        System.out.println("Название: " + item2.name + ", артикул: " + item2.article + ", количество: " + item2.quantity + ", цена: " + item2.price);
        System.out.println("Название: " + item3.name + ", артикул: " + item3.article + ", количество: " + item3.quantity + ", цена: " + item3.price);
        System.out.println("Название: " + item4.name + ", артикул: " + item4.article + ", количество: " + item4.quantity + ", цена: " + item4.price);
        System.out.println("Название: " + item5.name + ", артикул: " + item5.article + ", количество: " + item5.quantity + ", цена: " + item5.price);
    }
}
