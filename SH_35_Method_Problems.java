package com.company;
import java.util.Scanner;

public class SH_35_Method_Problems {

//    QUESTION 1 ==> write a programme to print table of n numbers
//    public static void Table (int a,int n){
//        for (int i=1;i<=10;i++){
//            System.out.println( a + " * " + i + " = " + a*i );
//
//        }
//    }


    //    QUESTION 2 ==> write a programme to print a pattern

//    public static void pattern(int n){
//        for (int i=1;i<n;i++){
//            for (int j=0; j<i;j++){
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//
//        }
//}



    //    QUESTION 3 === === ==> write a recursive  programme to print sum of fist n numbers  <== === === |
//    public static int  sumRec(int n){
//        if (n==1 ){
//            return 1;
//        }
//        return n + sumRec(n-1);
//
//    }


    //    QUESTION 4 === === ==> write a program to print opposite stars  <== === === |
//    public static void pattern2(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j<n; j++) {
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//
//        }
//    }

    //    QUESTION 5 === === ==> write a program to print fibonacci series of n numbers   <== === === |

//    public static int fibo(int n){
//        if (n == 0 || n == 1 ){
//            return 0;
//        }else if (n== 2){
//            return 1;
//        }
//        return fibo(n-1)+fibo(n-2);
//    }

    //    QUESTION 6 === === ==> write a number 2 program to print stars in recursion  <== === === |
//    public static void pattern3(int n) {
//        if (n>0){
//            pattern3(n-1);
//            for (int i=0;i<n; i++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//
//    }
    //    QUESTION 6 === === ==> write a number 4 program to print stars in recursion  <== === === |

    static void printPatternRowRecur(int n)
    {
        // base condition
        if (n < 1)
            return;

        // print the remaining stars
        // of the n-th row recursively
        System.out.print( " * ");
        printPatternRowRecur(n - 1);
    }

    static void printPatternRecur(int n)
    {
        // base condition
        if (n < 1)
            return;

        // print the stars of the n-th row
        printPatternRowRecur(n);

        // move to next line
        System.out.println ();

        // print stars of the
        // remaining rows recursively
        printPatternRecur(n - 1);

    }







    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
//        Table(2);

//        pattern(5);


//        System.out.println(sumRec(5));
        printPatternRecur(5);


//        System.out.println(fibo(5));



    }
}
