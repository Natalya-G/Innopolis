package Homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        Map<Player, Integer> players = new HashMap<>();
        players.put(new Player("Masha"),1);
        players.put(new Player("Sasha"),2);
        players.put(new Player("Pasha"),3);
        players.put(new Player("Dasha"),4);
        players.put(new Player("Misha"),5);
        players.put(new Player("Risha"),6);
        players.put(new Player("Toma"),7);
        players.put(new Player("Roma"),8);
        players.put(new Player("Sonya"),9);
        players.put(new Player("Kolya"),10);

        System.out.println(players);

        players.put(new Player("Kolya"),10);
        System.out.println(players);

    }

}
