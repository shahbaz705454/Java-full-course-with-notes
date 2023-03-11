package com.company;

import java.util.Scanner;

public class SH_15_2_Excersise_Array {


    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);



        //        PROBLEM 1        //Make array of 5 floating number and add there sum
//        float [] number =new float[5];
//
//        for (int i=0; i<5; i++){
//            number[i] = sc.nextFloat();
//
//        }
//        float sum=0;
//
//        for (float element : number){
//            sum += element;
//
//        }
//        System.out.println(sum);


//        PROBLEM 2  // Find out the given integer is present on array or not

//        int [] number = new int[5];
//
//        for (int i =0; i<5; i++){
//            number[i]= sc.nextInt();
//
//        }
//        System.out.println("Enter number you want to find");
//        int find = sc.nextInt();
//        boolean inarray = false;
//
//        for (int element: number){
//            if (find ==  element){
//                inarray= true;
//                break;
//            }
//        }
//        if (inarray){
//            System.out.println("number is found");
//        }else {
//            System.out.println("number is not found");
//        }




//        PROBLEM 3  // Calculate average of all student contain the marks in physics
//     float[] physics = new float[5];
//
//        for (float element : physics){
//            element = sc.nextFloat();
//        }
//        float sum =0;
//
//        for (float element : physics){
//            sum =sum+ element;
//        }
//        System.out.println(sum/physics.length);




//        PROBLEM 4  // Calculate sum of two 2d array elements;

//        int [][] mat1 ={{1,2,3},
//                       {4,5,6}};
//
//    int [][] mat2 ={{1,2,3},
//                    {4,5,6}};
//
//    int [][] result ={{0,0,0},
//                      {0,0,0}};
//
//
//    for (int i=0; i<mat1.length;i++){
//        for (int j=0; j<mat1[i].length;j++){
//            result[i][j]= mat1[i][j] + mat2[i][j];
//
//        }
//    }
//        for (int i=0; i<mat1.length;i++){
//            for (int j=0; j<mat1[i].length;j++){
//                System.out.print(result[i][j]+ " ");
//
//            }
//            System.out.println(" ");
//        }



        //        PROBLEM 4  // make a program to reverse an array


//        int [] number ={1,2,3,4,5,6,7,8,9};
//        int n = number.length;
//        int l = Math.floorDiv(n,2);
//        int temp;
//
//        for (int i=0; i<l; i++){
//            temp = number[i];
//            number[i]= number[n-i-1];
//            number[n-i-1]=temp;
//
//        }
//
//        for (int element : number) {
//            System.out.print(element + " ");
//
//        }


        //        PROBLEM 4  // make a program to find the maximum number element in the array

//            int[] number = {1,2,3,4,5,6,7,8,9,10};
//            int n=0;
//
//            for (int element :number){
//                if (element>n){
//                    n=element;
//                }
//            }
//        System.out.println(n);


        //        PROBLEM 4  // make a program to find the minimum number element in the array

//            int[] number = {1,2,3,4,5,6,7,8,9,10};
//            int n= 214748364;
//
//            for (int element :number){
//                if (element<n){
//                    n=element;
//                }
//            }
//        System.out.println(n);




        //        PROBLEM 4  // make a program to whether the array is sorted or not
//
//            int[] number = {1,2,3,4,5,9,6};
//            boolean sorted = true;
//            for (int i =0; i<number.length-1; i++){
//                if (number[i]>number[i+1]){
//                    sorted = false;
//                    break;
//                }
//            }
//            if (sorted){
//                System.out.println("Array is sorted");
//
//            }else {
//                System.out.println("Array is not sorted");
//            }


















    }
}
