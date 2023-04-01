package com.company;


class EkClass{
    int a;

    public int getA() {
        return a;
    }
    EkClass(){
        System.out.println("this is default constructor");
    }
    EkClass(int a){
        this.a =a;
        System.out.println("this is ekclass constructor with parameter a : "+ a);


    }
}

class DoClass extends EkClass{
    DoClass(int b){



        System.out.println("this is Do class constructor ");

    }

}

public class SH_47_This_And_Super_Keyword {
    public static void main(String[] args) {
//        EkClass e = new EkClass(5);
        DoClass d = new DoClass(8);

    }
}
