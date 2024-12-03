package CertificationModule1;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Game game = new Game();

         for (int i =1; i <= 5; i++){
            System.out.println("Раунд № " + i);
            System.out.print("Введите число (камень - 1, ножницы - 2, бумага - 3): ");
            int symbol = new Scanner(System.in).nextInt();
            int symbolRobot = new Random(System.currentTimeMillis()).nextInt(1, 3);
            game.getSymbolRobot(symbolRobot);
            game.getGameResult(symbol,symbolRobot);
        }
        game.getTotalResult();
    }
}
