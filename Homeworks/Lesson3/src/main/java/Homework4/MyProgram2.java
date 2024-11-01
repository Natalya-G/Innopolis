package Homework4;


import java.util.Scanner;

public class MyProgram2 {
    public static void main(String[] args) {

        int deltaSpeedUp;

        Car car1 = new Car("BMW");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());

        System.out.print("Изменение скорости: ");
        deltaSpeedUp = scanner.nextInt();

        car1.speedUp(deltaSpeedUp);
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());

        car1.brake();
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());

        car1.brake();
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());

        car1.brake();
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());

    }
}
