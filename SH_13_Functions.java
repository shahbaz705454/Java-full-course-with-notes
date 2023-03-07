package com.company;

import java.util.Scanner;

public class SH_13_Functions {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//         Factorial question

//        int i,fact=1;
//        System.out.println("Enter a number ");
//        int number=sc.nextInt(); ;//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);



//        febonachi series number
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

