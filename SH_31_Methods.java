package com.company;



public class SH_31_Methods {

                //    WHAT IS METHOD //
//A method is a block of code which only runs when it is called.
// You can pass data, known as parameters, into a method.
// Methods are used to perform certain actions,
// and they are also known as functions.


    static void sorted(int[] number){

             boolean sorted = true;
            for (int i =0; i<number.length-1; i++){
                if (number[i]>number[i+1]){
                    sorted = false;
                    break;
                }
            }

            if (sorted){
                System.out.println("Array is sorted");


            }else {
                System.out.println("Array is not sorted");

            }


    }


    public static void main(String[] args) {


        int[] mat = {1,2,3,4,5,6,7,8,9};
        sorted(mat);


    }



}
