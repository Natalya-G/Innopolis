package org.example;

public class Room {
    double widthRoom;
    double lengthRoom;
    double heightRoom;
    int numberWindows;
    boolean balcony;

    public Room(double widthRoom, double heightRoom, double lengthRoom, int numberWindows, boolean balcony) {
        this.widthRoom = widthRoom;
        this.heightRoom = heightRoom;
        this.lengthRoom = lengthRoom;
        this.numberWindows = numberWindows;
        this.balcony = balcony;
    }
}
