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




//        PROBLEM 2  // Calculate average of all student contain the marks in physics
     float[] physics = new float[5];

        for (float element : physics){
            element = sc.nextFloat();
        }
        float sum =0;

        for (float element : physics){
            sum =sum+ element;
        }
        System.out.println(sum/physics.length);
//






    }
}
