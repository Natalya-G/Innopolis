package CertificationModule1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите длину забора в метрах, используя запятую в качестве разделителя: ");
        double length = new Scanner(System.in).nextDouble();

        Inscription fence1 = new Inscription();
        fence1.getLengthInscription(length);

    }
}
