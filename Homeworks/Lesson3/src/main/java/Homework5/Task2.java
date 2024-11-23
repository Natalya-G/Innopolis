package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>();
        tasks.add("Помониторить вакансии");
        tasks.add("Погулять");
        tasks.add("Оплатить коммунальные услуги");
        tasks.add("Пересмотреть лекцию");
        tasks.add("Сделать домашнее задание");

        for (int i = 1; i <= tasks.size(); i++) {
            System.out.println("Задача " +  i + ": " + tasks.get(i - 1));
        }
    }
}
