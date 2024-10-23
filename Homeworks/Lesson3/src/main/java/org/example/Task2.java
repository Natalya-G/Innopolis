package org.example;

public class Task2 {
    public static void main(String[] args) {

        Flat flat = new Flat(3, 5, 56.4, true);
        System.out.println("Количество комнат: " + flat.numberRooms);
        System.out.println("Этаж: " + flat.floor);
        System.out.println("Площщадь квартиры: " + flat.area);
        System.out.println("Наличие балкона: " + flat.balcony);

    }
}
