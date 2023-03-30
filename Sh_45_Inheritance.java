package com.company;


class Base{
    int x;

    public Base() {
        this.x = 0;
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{


    int y;






    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Sh_45_Inheritance {
    public static void main(String[]args){
//        what is inheritance ?
//        ==>inheritance is a feature of object-oriented programming that allows a new class to be based on an existing class,
//        inheriting its properties and methods.This enables code reuse and polymorphism, as the derived class can use and extend
//        the functionality of the base class without having to redefine it.

//
//        In Java, there are 4 types of inheritance:
//
//        Single inheritance: A subclass extends a single superclass.
//
//        Multilevel inheritance: A subclass extends a class that is itself a subclass of another class.
//
//  Hierarchical inheritance: Multiple classes extend a single superclass.
//
//        Multiple inheritance: A subclass inherits from multiple superclasses.
//        however, Java does not support multiple inheritance of classes, only multiple inheritance of interfaces.





//             creating class in base class
               Base base1 =new Base();
               base1.setX(33);
               int t =base1.getX();
        System.out.println(t);

//        creating class in derived class and use base class methods because there methods are public
        Derived derived1 =new Derived();
        derived1.setX(22);
        int a =  derived1.getX();
        System.out.println(a);
        derived1.setY(99);
        int b = derived1.getY();
        System.out.println(b);

    }
}