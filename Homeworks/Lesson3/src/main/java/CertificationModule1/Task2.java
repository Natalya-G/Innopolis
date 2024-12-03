package CertificationModule1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Введите дату последнего полива в формате dd/MM/yyyy: ");
        String date = new Scanner(System.in).nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lastDate = LocalDate.parse(date, dateFormatter);

        LocalDate nowDate = LocalDate.now();

        long period = lastDate.until(nowDate, ChronoUnit.DAYS);
        System.out.println("Количество дней после последнего полива: " +  period);

        Watering watering = new Watering();
        watering.setWateredDate(period, nowDate, lastDate);
    }
}
