package com.company;

import java.util.Scanner;

public class SH_12_Hard_Pattern_Question {
    public static void main(String[] argue) {
        Scanner sc = new Scanner(System.in);

//-------------//Ques// Print the butter fly pattern //------------------------------------------
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            //First part
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            //Second part
//
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//
//
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////          Third part
//        for (int i = 1; i <= n; i++) {
//
//            for (int j =i; j <= n; j++) {
//                System.out.print("*");
//            }
//            for (int j = 2; j <=i; j++) {
//                System.out.print(" ");
//            }
//
//            //Fourth
//
//            for (int j = 2; j <= i; j++) {
//                System.out.print(" ");
//
//
//            }
//            for (int j = i; j <= n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();

// Ques// Print a pattern of a diamond //
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        //for the upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower portion
        for (int i=1;i<=n;i++){
            for (int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n-i;j++){
                System.out.print("*");

            }


            for (int j=1;j<=n-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }









    }

}

