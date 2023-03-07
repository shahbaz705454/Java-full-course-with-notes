package com.company;

import java.util.Scanner;

public class SH_16_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter hoe many rows you need");
//        int rows = sc.nextInt();
//        System.out.println("enter how many columns you need");
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//
//        System.out.println("Enter value on array");
//        for (int i = 0; i < rows; i++) {
//
//            for (int j = 0; j < cols; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//
//        }
//
//        System.out.println("Enter number you want to search");
//        int src = sc.nextInt();
//
//        for (int i=0; i<rows;i++){
//            for (int j = 0; j < cols; j++){
//                if(src == numbers[i][j]){
//                    System.out.println("Number found at (" + i + ", " + j + ")");
//                }
//            }
//        }


//        OUTPUT //
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

//------------------------------------------------------------------------------------------------------------------------


//        QUES // Print the spiral order matrix as output for a given matrix of numbers.

        System.out.println("enter how many row you want");
        int n = sc.nextInt();
        System.out.println("Enter columns you want");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
//        System.out.print("The output is : ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }


        System.out.println("The Spiral Order Matrix is : ");
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;


        //To print spiral order matrix

        while( top <= bottom && left <= right) {
            //1
            for(int col=left; col<=right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;


            //2
            for(int row=top; row<=bottom; row++) {
                System.out.print(matrix[row][right] +" ");
            }
            right--;


            //3
            for(int col=right; col>=left; col--) {
                System.out.print(matrix[bottom][col] + " ");
            }
            bottom--;


            //4
            for(int row=bottom; row>=top; row--) {
                System.out.print(matrix[row][left] + " ");
            }
            left++;


            System.out.println();
        }
    }
}
