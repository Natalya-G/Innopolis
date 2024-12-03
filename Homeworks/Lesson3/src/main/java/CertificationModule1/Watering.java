package CertificationModule1;

import java.time.LocalDate;

public class Watering {

    private LocalDate wateredDate;
    private int humidity;

    public void setWateredDate(long period, LocalDate nowDate, LocalDate lastDate) {

        boolean winter = nowDate.getMonthValue() == 12 || nowDate.getMonthValue() == 1 ||
                nowDate.getMonthValue() == 2;
        boolean spring = nowDate.getMonthValue() == 3 || nowDate.getMonthValue() == 4 ||
                nowDate.getMonthValue() == 5;
        boolean autumn = nowDate.getMonthValue() == 9 || nowDate.getMonthValue() == 10 ||
                nowDate.getMonthValue() == 11;
        if (winter) {
            if (period >= 30) {
                wateredDate = LocalDate.now();
            } else {
                wateredDate = lastDate.plusMonths(1);
            }
        } else if (spring || autumn) {
            if (period >= 7) {
                wateredDate = LocalDate.now();
            } else {
                wateredDate = lastDate.plusWeeks(1);
            }
        } else {
            Sensor sensor = new Sensor();
            humidity = sensor.getHumidity ();
            System.out.println("Влажность: " + humidity + "%");
            if (humidity >= 30) {
                wateredDate = nowDate.plusDays(2);
            } else {
                wateredDate = LocalDate.now();
                }
            }
        System.out.println("Дата полива: " + wateredDate);
    }

}


