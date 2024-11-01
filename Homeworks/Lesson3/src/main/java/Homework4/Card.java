package Homework4;

import java.util.Scanner;

public class Card {

    private String numberCard;
    private String finalDate;
    private String cvv;
    private String pinCode;

    public Card(String numberCard, String finalDate, String cvv, String pinCode) {
        this.numberCard = numberCard;
        this.finalDate = finalDate;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    public String getNumberCard() {
        String newNumberCard = numberCard.replaceAll(" ", "");
        return "**** **** **** " + newNumberCard.substring(12, 16);
    }

    public void PinCodeCheck(String pinCode) {
        if (this.pinCode.equals(pinCode)) {
            System.out.println("Номер карты: " + this.numberCard);
        } else {
            System.out.println("Неверный пинкод!");
        }
    }

}
