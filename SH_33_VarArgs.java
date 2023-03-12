package com.company;

public class SH_33_VarArgs {
//    static int sum(int a, int b){
//        return a+b;
//    }static  int sum(int a,, int b,int c){
//        return a+b+c;
//    }static int sum(int a, int b,int c,int d){
//        return a+b+c+d;
//    }
//
//    when we want to use multiple input but not want to make multiple method we use VARARGS ---//

     static int sum(int...arr){
        int d=0;
        for (int s: arr){
            d += s;
        }
        return d;

    }

    public static void main(String[] args) {
        System.out.println("the sum of 3 and 5 is : " + sum(3,5)) ;
        System.out.println("the sum of 3 and 5 is : " + sum(3,5,6)) ;
        System.out.println("the sum of 3 and 5 is : " + sum(3,5,6,7)) ;

    }
}
