package com.company;

import java.util.*;


public class SH_18_Rock_Paper_Game {
    public static void main(String[] args) {


//------------ Programme 1 // -------make a program that play rock, sessior, and paper game with user ---------

        int min = 1;
        int max = 3;

        Scanner sc = new Scanner(System.in);



//        1=Scissor;
//        2=Rock;
//        3= paper;

        int a = 1;
        int win =0;
        int lost =0;
        int tie =0;

        while (a <= 5) {
            int computer = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(computer);
            System.out.println("Enter a Number: \n\t 1.Scissor\n\t 2.Rock\n\t 3.Paper");
            int user = sc.nextInt();




            if (user <= 3) {
                switch (user) {
                    case 1 -> {
                        if (computer == 2) {
                            System.out.println("LOST");
                            lost++;
                        } else if (computer == 3) {
                            System.out.println("WIN");
                            win++;

                        } else if (computer == 1) {
                            System.out.println("Tie");
                            tie++;
                        }
                    }
                    case 2 -> {
                        if (computer == 1) {
                            System.out.println("WIN");
                            win++;
                        } else if (computer == 3) {
                            System.out.println("LOST");
                            lost++;

                        } else if (computer == 2) {
                            System.out.println("Tie");
                            tie++;
                        }

                    }
                    case 3 -> {
                        if (computer == 1) {
                            System.out.println("LOST");
                            lost++;
                        } else if (computer == 3) {
                            System.out.println("Tie");
                            tie++;

                        } else if (computer == 2) {
                            System.out.println("WIN");
                            win++;
                        }

                    }
                }


            } else {
                System.out.println("Wrong number");
            }
            a++;

        }
        if (win>=3){
            System.out.println("Congratulation, You WON!");
        }
        else if (lost>=3){
            System.out.println("Sorry You LOST!");

        }else {
            System.out.println("Tie");
        }
    }
}