package org.example;

public class Task1 {
    public static void main(String[] args) {

        String cardNumber = "1234567890123456";
        cardNumber = cardNumber.replace(" ", "");
        System.out.println("**** **** **** " + cardNumber.substring(12,16));
    }
}
