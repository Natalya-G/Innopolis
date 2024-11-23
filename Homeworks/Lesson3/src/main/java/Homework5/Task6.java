package Homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {

        int first = 0;
        int second = 0;
        int third = 0;

        Map<Player, Integer> points = new HashMap<>();
        points.put(new Player(1,"Masha", true), 0);
        points.put(new Player(2,"Sasha", false), 0);
        points.put(new Player(3,"Pasha", true), 0);
        points.put(new Player(4,"Dasha", false), 0);
        points.put(new Player(5,"Misha",true), 0);
        points.put(new Player(5,"Risha", true), 0);
        points.put(new Player(7,"Toma", false), 0);
        points.put(new Player(8,"Roma", false), 0);
        points.put(new Player(9,"Sonya", false), 0);
        points.put(new Player(10,"Kolya", true), 0);

        points.put(new Player(4,"Dasha", false), 10);
        points.put(new Player(7,"Toma", false), 12);
        points.put(new Player(8,"Roma", false), 11);
        points.put(new Player(9,"Sonya", false), 13);
        points.put(new Player(10,"Kolya", true), 5);

        for (Map.Entry<Player, Integer> entry : points.entrySet()) {
            Player key = entry.getKey();
            Integer value = entry.getValue();
            if (entry.getValue() >= first) {
                third = second;
                second = first;
                first = entry.getValue();
            } else if (entry.getValue() >= second) {
                third = second;
                second = entry.getValue();
            } else if (entry.getValue() >= third) {
                third = entry.getValue();
            }
        }
        for (Map.Entry<Player, Integer> entry : points.entrySet()) {
            Player key = entry.getKey();
            Integer value = entry.getValue();
            if (value == first) {
                System.out.println("Первое место, игрок: " + key + ", количество очков: " + value);
            };
        }
        for (Map.Entry<Player, Integer> entry : points.entrySet()) {
            Player key = entry.getKey();
            Integer value = entry.getValue();
            if (value == second) {
                System.out.println("Второе место, игрок: " + key + ", количество очков: " + value);
            };
        }
        for (Map.Entry<Player, Integer> entry : points.entrySet()) {
            Player key = entry.getKey();
            Integer value = entry.getValue();
            if (value == third) {
                System.out.println("Третье место, игрок: " + key + ", количество очков: " + value);
            };

        }

    }

}
