package com.company;

class base1 {
    base1() {
        System.out.println("i am a base class constructor");
    }

    base1(int a) {
        System.out.println("i am a base class constructor with parameter a :" + a);

    }
}

    class Derived1 extends base1{
        Derived1(){
            System.out.println("this is derived class constructor ");
        }
        Derived1(int b ,int c){
            super(b);
            System.out.println("this is derived class constructor with parameter b and c : " + c);


        }
    }

    class Childderived extends Derived1{

        Childderived(){
            System.out.println("this is child class constructor");
        }

        Childderived(int d,int f,int g){
            super(d,f);
            System.out.println("this is child derived class  constructor with d,e,f : "+ g);

        }
    }



public class SH_46_Constructor_In_Inheritance {
    public static void main(String[] args) {
        base1 Derived1  =new base1();
        Derived1 f = new Derived1();
        Childderived d =new Childderived();




    }
}
