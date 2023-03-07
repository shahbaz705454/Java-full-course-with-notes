package com.company;

import java.util.Scanner;

public class SH_15_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] marks = new int[3];
//        marks[0] = 98;
//        marks[1] = 95;
//        marks[2] = 90;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(marks[i]);
//        }

//        Ques// Find the number in A array if number is found print the index of that number;;
//        System.out.println("Enter the  length of the array");
//
//        int size = sc.nextInt();
//        int[] marks = new int[size];
//
//
//        for (int i = 0; i < size; i++) {
//
//            System.out.println("Enter number for the array");
//
//            marks[i] = sc.nextInt();
//
//        }
//        System.out.println("Enter the number you want to search ");
//        int x = sc.nextInt();
//
//        for (int i = 0; i < marks.length; i++) {
//            if (marks[i] == x) {
//                System.out.println("The number is found at the index " + i);
//            }
//        }
//        System.out.println("Number not found in the array");


//---------------------------------------------------------------------------------------------


//   ques 1//Take an array of names as input from the user and print them on the screen.


//        System.out.println("Enter the string size");
//        int size =sc.nextInt();
//         String name[] =new String[size];
//
//         for (int i =0;i<size; i++){
//             name[i]=sc.next();
//
//         }
//       for (int i=0;i<name.length;i++) {
//
//           System.out.println("Name is " + name[i]);
//
//
//
//       }


//   Ques 2//     Find the maximum & minimum number in an array of integers.
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//
//        //input
//        for(int i=0; i<size; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] < min) {
//                min = numbers[i];
//            }
//            if(numbers[i] > max) {
//                max = numbers[i];
//
//
//            }
//        }
//        System.out.println("Largest number is : " + max);
//        System.out.println("Smallest number is : " + min);
//


//        QUES...... //Take an array of numbers as input and check if it is an array sorted in ascending order.
//        Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.


        int size = sc.nextInt();
        int numbers[] = new int[size];


        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }


        boolean isAscending = true;
        for (int i = 0; i < numbers.length - 1; i++) { // NOTICE numbers.length - 1 as termination condition
            if (numbers[i] > numbers[i + 1]) { // This is the condition for descending order
                isAscending = false;
            }
        }


        if (isAscending==true) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }


    }
}

