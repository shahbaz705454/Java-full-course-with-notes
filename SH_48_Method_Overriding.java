package com.company;



class A{
    public void main1(){
        System.out.println("This is main meethod of A class");
    }
    public void meth1(){


        System.out.println("This is method 1 of class A");

    }

}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("This is method 1 of B class");
    }
}

public class SH_48_Method_Overriding {
    public static void main(String[] args) {

        A newobjA =new A();
        newobjA.main1();
        newobjA.meth1();

        B newcobjB =new B();
        newcobjB.main1();
        newcobjB.meth1();

    }
}
