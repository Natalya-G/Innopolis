package Homework5;

public class Task1 {
    public static void main(String[] args) {

        Player player1 = new Player(1, "Masha", true);
        Player player2 = new Player(1, "Masha", true);

        if (player1 == player2) {
            System.out.println("player1 == player2 ==> true");
        } else {
            System.out.println("player1 == player2 ==> false");
        }

        if (player1.equals(player2)) {
            System.out.println("player1.equals(player2) ==> true");
        } else {
            System.out.println("player1.equals(player2) ==> false");
        }

    }
}
