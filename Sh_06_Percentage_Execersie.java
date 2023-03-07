package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class Sh_06_Percentage_Execersie {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("12th Board percentage");
        System.out.println("Enter your English marks");
        int a = sc.nextInt();
        System.out.println("Enter the Accountancy marks");
        int b =sc.nextInt();

        System.out.println("Enter the Economy marks");
        int c = sc.nextInt();
        System.out.println("Enter the Physical Education marks ");
        int d= sc.nextInt();

        System.out.println("Enter the Buisness Studies marks");
        int e =sc.nextInt();


        float sum = (a+b+c+d+e)/5;

        System.out.println("The percentage % you got in the 12th board is: ");
        System.out.println(sum+"%");

        if (sum>33){

            System.out.println("Congratulation you have been passed in 12th board ");

        }
else {
            System.out.println("Try next time with more confidence");

        }

    }
}
