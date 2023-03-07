package com.company;

import java.util.*;

public class SH_11_Patterns_questions {
    public static void main(String[] args) {


// ---------------------------------       QUES..// Solid Rectangle Question //-----------------------------


        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you patter length");
//        int n = sc.nextInt();
//
//        System.out.println("Enter the breath of the Pattern ");
//        int m = sc.nextInt();
//
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(" ");
//            for (int f = 1; f <= m; f++) {
//                System.out.print("*");
////
//            }
//        }

//  -------------------------------------      QUES//A Hallow rectangle //--------------------------------

//        System.out.println("Enter you patter length");
//        int n = sc.nextInt();
//
//        System.out.println("Enter the breath of the Pattern ");
//        int m = sc.nextInt();
//
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || i == n || j == 1 || j == m) {
//                     System.out.print("*");
//
//                } else {
//                    System.out.print(" ");
//                }
//
//
//            } System.out.println(" ");

//        }


        //  -------------------------------------      QUES//Print a half  pyramid pattern //--------------------------------

//        System.out.println("Enter you patter length");
//        int n = sc.nextInt();
//
//        -------------------------First meathod ---------------
//        String m = "*";
//        for (int i = 1; i <= n; i++) {
//            System.out.println(m);
//            m = m + "*";
//    }


//        ------Second meathod ------------

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


//  -------------------------------------      QUES//Print a half upward pyramid pattern //--------------------------------

//        System.out.println("Enter you patter length");
//        int n = sc.nextInt();
//
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        ------------------------      QUES//Print a half inverted pyramid pattern //--------------------------------
//        System.out.println("Enter you patter length");
//        int n = sc.nextInt();
//
//        for (int i=1;i<=5;i++){
//            for (int j=i;j<=5;j++){
//                System.out.print("x");
//            }
//            System.out.println(" ");
//        }


//        ------------------------      QUES//Print a half inverted pyramid pattern //--------------------------------
//
        System.out.println("Enter you patter length");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");


            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }


            System.out.println(" ");

        }


        //        ------------------------      QUES//Print a half pyramid with number pattern //--------------------------------

//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//
//
//            System.out.println();
//
//
//        }

////        ------------------------      QUES//Print a half inverted pyramid with number pattern //--------------------------------
//
//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i+1 ; j++) {
//                System.out.print(j);
//            }
//
//
//            System.out.println();
//
//
//        }


// //        ------------------------      QUES//Print a half  pyramid with different numbers  number pattern //--------------------------------
//
//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        int number=1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(number);
//                number++;
//            }
//
//
//            System.out.println();
//
//
//        }

//// ------------------------QUES//Print a half  pyramid with 0 and 1 number only pattern //--------------------------------
//
//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                int sum = i + j;
//                if (sum % 2 == 0) {
//                    System.out.print("1 ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//
//            System.out.println();
//
//        }


// ------------------------ QUES//Print a solid rhombus. //--------------------------------

//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <=n; j++) {
//                System.out.print("X");
//
//            }
//            System.out.println();
//        }


// ------------------------ QUES//Print a number pyramid. //--------------------------------

//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//
//            //numbers
//            for(int j=1; j<=i; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

// ------------------------ QUES//Print a palindromic number pyramid. //--------------------------------

//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//
//            //first part
//            for(int j=i; j>=1;j-- ) {
//                System.out.print(j);
//            }
//
//
//            //second part
//            for(int j=2; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }



    }
}















