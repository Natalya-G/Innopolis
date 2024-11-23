package Homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();
        films.add(new Movie("Загадочная история Бенджамина Баттона", 8.1, "драма, фэнтези", "США", "да"));
        films.add(new Movie("1+1", 8.8, "драма, комедия", "Франция", "нет"));
        films.add(new Movie("Иван Васильевич меняет профессию", 7.4, "комедия", "СССР", "нет"));

        System.out.println("Введите порядеовый номер фильма от 1 до " + films.size());
        int number = new Scanner(System.in).nextInt();

        System.out.println(films.get(number - 1));

    }
}
