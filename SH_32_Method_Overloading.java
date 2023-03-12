package com.company;

public class SH_32_Method_Overloading {
//    static void TellJoke(){
//        System.out.println("Hello this is a joke for you ha ha ha");
//    }
//    static void change(int []marks){
//        marks[0]=29;

//       In case of array the reference is passed same is the case for  object passing to method //   ---Important----- //
//    }

//    static void add(){
//        System.out.println("Please provide some number for addition");
//    }
//    static void add(int a, int b){
//        System.out.println(a+b);
//                                             // here is method overloading works
//    }

    static void greet(){
        System.out.println("Hello good morning " );
    }
    static void greet(int a){
        System.out.println("Hello good morning " + a);
    }
    static void greet(int a ,int b){
        System.out.println("Hello good morning " + (a+b));
    }




    public static void main(String[] args) {

//        int []arr ={2,3,4,5,6,7,8};
//        change(arr);
//        System.out.println(arr[0]);
        int a=5,b=30,c=10;
//        add(a,b);
//        add();

//       Method overloading
     greet();
     greet(a);
     greet(b,c);


    }
}
