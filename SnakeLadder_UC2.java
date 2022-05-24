package com.company;

public class SnakeLadder_UC2 {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder program");
        int starting_position = 0;
        System.out.println("Your Starting Position is "+starting_position);
        int die = (int) Math.floor((Math.random()*10)%6)+1;
        System.out.println("Roll The Die to Get a Number is = "+die);
    }
}
