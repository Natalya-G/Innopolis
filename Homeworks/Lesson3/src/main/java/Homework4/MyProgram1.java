package Homework4;

import java.util.Scanner;

public class MyProgram1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Card card1 = new Card("1111 2222 3333 4545",  "10.25", "123", "4545");
        System.out.println("Номер карты: " + card1.getNumberCard());

        System.out.print("Введите пинкод карты: ");
        String pinCode = scanner.nextLine();
        card1.PinCodeCheck(pinCode);
    }
}
