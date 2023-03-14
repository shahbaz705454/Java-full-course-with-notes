package com.company;

public class Sh_34_Recursion {
//  How to find factorial of a number using recursion
//    static int factorial(int n){
//       if (n==1 || n==0){
//           return 1;
//       }else {
//           return n*factorial(n-1);
//       }
//    }
//    static double factorial2(int n){
//        double ans=1;
//        for (int i=1; i<=n;i++){
//            ans *= i;
//
//        }
//        return ans;
//
//    }


    //    static int fibonacci(int n){
//        if (n== 0 || n ==1){
//            return n;
//
//
//        }else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//
//    }
//    ----------------------------------------------------------------------------------------
                 //How to find the sum of digits of a number using recursion ?
//    public static int sum(int n){
//
//        if (n == 0){
//            return 0;
//
//        }else {
//            return n%10 + sum(n/10);
//        }
//        or
//        return n==0 ? 0 : n%10+sum(n/10);
//    }

//    ---------------------print x^n(stack height = n)------------------
//    static int calcPower(int x,int n){
//        if (n == 0){
//            return 1;
//
//        }
//    if (x == 0){
//        return 0;
//    }
//    int xPownm1=calcPower(x,n-1);
//    int xPown= x* xPownm1;
//    return xPown;
//
//
//
//
//    }
    //    ---------------------print x^n(stack height =(logn))------------------
    static int calcPower2(int x,int n){
        if (n == 0){
            return 1;

        }
        if (x == 0){
            return 0;
        }
        if (n % 2 == 0){
            return calcPower2(x, n/2) * calcPower2(x,n/2);

        }else {
            return calcPower2(x, n/2) *calcPower2(x, n/2) * x;
        }



    }






    public static void main(String[] args) {
//        System.out.println(factorial2(5));
//        System.out.println(fibonacci(5));
//        for (int i =0;i<5;i++){
//            System.out.println(fibonacci(i));
//
//        }

// ----------------------------------------------------------------------
//        System.out.println(sum(123));


 //------------------Calcpower--------------------------------------------
        int x =2,n=5;
        int ans=calcPower2(x,n);
        System.out.println(ans);


    }
}
