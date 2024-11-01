package Homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.print("Четное число. ");
            if (number % 4 == 0) {
                System.out.println("Кратно четырем.");
            }
        } else {
            System.out.print("Нечетное число. ");
            if (number % 3 == 0) {
                System.out.println("Кратно трём.");
            }
        }
    }
}

