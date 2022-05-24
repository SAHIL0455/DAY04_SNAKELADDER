package com.company;

public class SnakeLadder_UC4 {
    public static final int Ladder = 1;
    public static final int Snake = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder program");
        int starting_position = 1;
        System.out.println("Your Starting Position is "+starting_position);
        int current_positon = 1;
        while (current_positon <= 100){
            int die =(int) Math.floor((Math.random() * 10) % 6) + 1;
            System.out.println("Roll The Die to Get a Number is = " + die);
            int option =(int) Math.floor((Math.random() * 10) % 3) + 1;
            switch (option){
                case Ladder:
                    current_positon += die;
                    System.out.println("Get a ladder, Now your Position is " + current_positon);
                    break;
                case Snake:
                    current_positon -=die;
                    if (current_positon <= 0){
                        current_positon = 1;
                    }
                    System.out.println("Get a snake, Now your Position is " + current_positon);
                    break;
                default:
                    current_positon += 0;
                    System.out.println("They have No Ladder and Snake, so your Position is " + current_positon);
            }
        }
    }
}
