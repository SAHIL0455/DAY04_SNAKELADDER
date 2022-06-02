package com.company;

public class SnakeLadder_UC5 {
        static final int Ladder = 1;
        static final int Snake = 2;
        
        public static void main(String[] args) {
            System.out.println("Welcome to snake and ladder program");
            int starting_position = 1;
            System.out.println("Your Starting Position is "+starting_position);
            int current_positon = 0;

            while (current_positon < 100) {
                int dice =(int) Math.floor((Math.random() * 10) % 6) + 1;
                System.out.println("dice: " + dice);
                int option =(int) Math.floor((Math.random() * 10) % 3) + 1;

                if ((option == Ladder) && (current_positon + dice) <= 100)
                {
                    System.out.println("Get a ladder, Now your Position is");
                    current_positon = current_positon + dice;
                }
                else if (option == Snake)
                {
                    System.out.println("Get a snake, Now your Position is ");
                    current_positon = current_positon - dice;
                }
                else
                {
                    System.out.println("No Play");
                }

                if (current_positon < 0)
                    current_positon = 0;

                System.out.println("current_positon: " + current_positon);
            }
        }
}