package com.company;

public class SnakeLadder_UC3 {
    public static final int Ladder = 1;
    public static final int Snake = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder program");
        int starting_position = 0;
        System.out.println("Your Starting Position is " + starting_position);
        int die = (int) Math.floor((Math.random() * 10) % 6) + 1;
        System.out.println("Roll The Die to Get a Number is =" + die);
        int option = (int) Math.floor((Math.random() * 10) % 3) + 1;
        switch (option) {
            case Ladder:
                System.out.println("Get a ladder, Now your Position is " + die);
                break;
            case Snake:
                System.out.println("Get a snake, Now your Position is " + starting_position);
                break;
            default:
                System.out.println("No play, so your Position is " + starting_position);
        }
    }
}
