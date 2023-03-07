package com.company;

import java.util.Scanner;
import java.util.*;


public class SH_1_Quick_Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");
//        System.out.println("******");
//        System.out.println("*******");
//        System.out.println("********");

//----------------------------------------------------------------------------------------------------------------------

//--->  There are two types of datatype  in java
//        --->Primitive
//        --->Non-primitive

//        *PRIMITIVE DATA TYPE--->
//                                 -->There are 8 types of primitive data type
//                                  1->Byte
//                                  2->char
//                                  3->short
//                                  5->boolean
//                                  5->int
//                                  6->long
//                                  7->float
//                                  8->double


//          *NON-PRIMITIVE DATA TYPES--
//                                  1->Array
//                                  2->Object
//                                  3->Classes
//                                  4->String


//------------------------------------------------------------------------------------------------------------------------------------------------------------------


// int a = 20;
// int b = 30;
//  b=50;
//  String c="my name is toy stark";
//  System.out.println(c);

        //QUES //   Adding two numbers //

//
//int a=10;
//int b=30;
//int sum=a+b;
//
//System.out.println(sum);

//----------------------------------------------------------------------------------------------------------------------


// int a =10;
// int b=5;
// int ans =a*b/a-b;
// int ans2 =(a*b)/(a-b);
//        System.out.println(ans);
//        System.out.println(ans2);


//--------------------------------------------------------------------------------------------------------------------------
        //     Taking Input form users //


//        System.out.println("Enter your name ");
//        String name = sc.nextLine();
//        System.out.println(name);


        //QUES// TAKE TWO INPUT FORM USER AND SUM OF THOSE//

//        int a;
//        int b;
//        System.out.println("Enter number A");
//        a = sc.nextInt();
//        System.out.println("Enter number B");
//        b = sc.nextInt();
//
//        int sum= a+b;
//        System.out.println("The sum these number is "+sum);


//___________________________________________________________________________________________________________________________________________________


//----------------------------------- //--> Conditional Statement <--------------------------------------------------------------------------------

//    -->if else....
//    -->else if....
//    -->Switch.....
//    -->Break......


//---------------------------------------//     IF-ELSE       //---------------------------------------------------------------------------------


//        System.out.println("Enter your age ");
//        int age = sc.nextInt();
//        if (age >= 13 & age<= 19) {
//            System.out.println("You are a Teenager");
//
//        } else {
//            System.out.println("You are not a Teenager");
//        }


        //Ques//Taking number from user check whether it is even or odd//


//        System.out.println("Enter your Number");
//        int num =sc.nextInt();
//        if (num%2==0){
//            System.out.println("The number is Even");
//
//        }else {
//            System.out.println("The number is Odd");
//
//        }


        //QUES // Taking two number from user a and b check whether a=b or a>b or a<b //

//        System.out.println("Enter Number A");
//        int a =sc.nextInt();
//        System.out.println("Enter Number B");
//        int b= sc.nextInt();
//
//        if (a == b) {
//            System.out.println("A is equal to B");
//
//        }else{
//            if (a>b){
//                System.out.println("A is greater than B");
//            }else {
//                System.out.println("A is lesser than B");
//
//            }
//        }


//       -------------------------------//      Else-IF    // ----------------------------------------------------------------------------

        //QUES // Taking two number from user a and b check whether a=b or a>b or a<b //

//        System.out.println("Enter Number A");
//        int a = sc.nextInt();
//        System.out.println("Enter Number B");
//        int b = sc.nextInt();
//
//        if (a == b) {
//            System.out.println("A is equal to B");
//
//        } else if (a > b) {
//            System.out.println("A is greater than B");
//        } else {
//            System.out.println("A is lesser than B");
//        }


        //QUES// Taking 3 option from user if option 1 is true print hello else on 2 namaste else on 3 for A.S//

//        System.out.println("Please choose\n 1.Hello\n 2.Namaste\n 3.A.S.");
//        int a = sc.nextInt();
//        if (a == 1) {
//            System.out.println("Hello");
//
//        } else if (a == 2) {
//            System.out.println("Namaste");
//
//        } else if (a == 3) {
//            System.out.println("A.S");
//
//
//        } else {
//            System.out.println("Wrong Selection");
//        }


// ---------------------------------------  // SWITCH  & BREAK // --------------------------------------------------------------
        //QUES// Taking 3 option from user if option 1 is true print hello else on 2 namaste else on 3 for A.S//


//        System.out.println("Please choose\n 1.Hello\n 2.Namaste\n 3.A.S.");
//        int a = sc.nextInt();
//        switch (a) {
//            case 1:
//                System.out.println("Hello");
//                break;
//            case 2:
//                System.out.println("Namaste");
//                break;
//            case 3:
//                System.out.println("A.S.");
//                break;
//            default:
//                System.out.println("Invalid option");
//
//        }

        //QUES// Making a calculator for adding two integer subtracting,dividing, multiplying,etc..//

//        System.out.println("Enter your first Number ");
//        int a= sc.nextInt();
//        System.out.println("Enter your Second number ");
//        int b= sc.nextInt();
//        System.out.println("Choose from bellow");
//        System.out.println(" 1.Addition(+)\n 2.Subtraction(-)\n 3.Multiplication(*)\n 4.Dividing(/)\n 5.Modulo(%)");
//        int c= sc.nextInt();
//
//
//        switch (c){
//            case 1:
//                System.out.println(a+b);
//                break;
//            case 2:
//                System.out.println(a-b);
//                break;
//            case 3:
//                System.out.println(a*b);
//                break;
//            case 4:
//                System.out.println(a/b);
//                break;
//            case 5:
//                System.out.println(a%b);
//                break;
//            default:
//                System.out.println("Invalid Input");
//
//        }


//-----------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------> LOOPS IN JAVA <-----------------------------------------------------------------------------


//   --->For Loop
//   --->While Loop
//   --->Do While Loop


//        ---------------------------------------------- //  FOR LOOPS //-------------------------------------------------------

//        int a=1;
//        for (int counter=0; counter<100;counter++){
//            System.out.println("This is "+a);
//            a++;
//        }


        //QUES// PRINT THE SUM OF FIRST N NUMBERS..//
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//        int sum=0;
//        for (int a=1;a<=n;a++){
//
//            sum=sum+a;
//        }
//        System.out.println("The of the number is "+sum);


        //QUES// Print the table of the number input by the user..//

//        System.out.println("Enter the number for table ");
//        int n = sc.nextInt();
//        int sum=1;
//
//        for (int i=1;i<=10;i++){
//            sum=n*i;
//            System.out.println(n+"*"+i+"="+sum);
//
//
//        }


        //QUES// Print all the even number till n//
//        System.out.println("Enter a Number");
//        int n = sc.nextInt();
//
//
//        if (n <= 20) {
//            for (int i = 0; i <= n; i++) {
//
//                if (i % 2 == 0) {
//                    System.out.print("even ");
//                } else {
//                    System.out.println("odd");
//                }
//
//
//            } else{
//                System.out.println("out of 20 number");


//        //QUES//. Print if a number is prime or not (Input n from the user).
//        System.out.println("Enter a number checking weather it is a prime or not ");
//        int n = sc.nextInt();
//
////       ------>First way to solve this question<-------
//
//        boolean isPrime = true;
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//
//        if (isPrime) {
//            if (n == 1) {
//                System.out.println("This is neither prime not composite");
//            } else {
//                System.out.println("This is a prime number");
//            }
//        } else {
//            System.out.println("This is not a prime number");
//        }


//
//  ----------->SECOND WAY TO SOLVE THIS QUESTION <------------------------------
//
//
//
//
//        if (n % n == 0 && n % 1 == 0 &&  n%2!=0) {
//            System.out.println("This is a prime number ");
//        } else {
//            System.out.println("This is not a prime number");
//        }


//---------------------------------------------------------//While LOOP //-----------------------------------------------------------
//        int a=0;
//        while (a <100){
//            System.out.println("This is "+a);
//            a++;
//        }
//


//-------------------------------------------------------//DO WHILE //-----------------------------------------------------------------------
//        int a=0;
//
//        do {
//
//            System.out.println("This is do while loop ");
//            a++;
//
//        }while (a<10);{
//            System.out.println("The Game is starting......... ");
//            a=a+1;
//
//        }


                //QUES......... //   Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
                //If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
                //If they enter 0 then stop.
                //If he/ she scores :
                //Marks >=90 -> print “This is Good”
                //89 >= Marks >= 60 -> print “This is also Good”
                //59 >= Marks >= 0 -> print “This is Good as well”//

            }


        }





