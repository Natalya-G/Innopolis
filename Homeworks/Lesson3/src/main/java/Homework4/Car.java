package Homework4;

public class Car {

    private String name;
    private int currentSpeed = 0;

    public Car(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp(int deltaSpeedUp) {
        this.currentSpeed = currentSpeed + deltaSpeedUp;
    }

    public void brake() {
        if(this.currentSpeed <= 10) {
        this.currentSpeed = 0;
        } else {
            this.currentSpeed = currentSpeed - 10;
        }
    }
}
