package Homework4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        boolean symbolsContains;
        boolean numbersContains;
        String password;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        password = scanner.nextLine();

        symbolsContains = password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("№");
        numbersContains = password.contains("0") || password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") || password.contains("9");

        if (password.length() >= 8 && symbolsContains && numbersContains) {
            System.out.println("Пароль принят ");
        } else if (password.length() < 8) {
            System.out.println("ОШИБКА: Пароль менее 8 символов");
            if (!symbolsContains) {
                System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            }
            if (!numbersContains) {
                System.out.println("Пароль должен содержать минимум 1 цифру");
            }
        } else if (!symbolsContains) {
            System.out.println("ОШИБКА: Пароль должен содержать минимум 1 спецсимвол");
            if (!numbersContains) {
                System.out.println("Пароль должен содержать минимум 1 цифру");
            }
        } else {
            System.out.println("ОШИБКА: Пароль должен содержать минимум 1 цифру");
        }
    }

}
