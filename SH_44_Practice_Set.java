package com.company;
class cylinder{


    int height;

    public cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;

    }

    public double volumeCylinder(){
        return Math.PI*height*radius*radius;
    }
}




class rectangle{
    int length;
    int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth =5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double areaRectangle(){
        return length*breadth;
    }
}

public class SH_44_Practice_Set {
    public static void main(String[] args) {


//       //problem 1
        cylinder mycylinder = new cylinder(9,12);
//        mycylinder.setHeight(9);
//        mycylinder.setRadius(12);
        int a=mycylinder.getHeight();
        System.out.println(a);
        int b =mycylinder.getRadius();
        System.out.println(b);

//        problem 2

        double c=mycylinder.surfaceArea();
        System.out.println(c);
        double d =mycylinder.volumeCylinder();
        System.out.println(d);


//        problem3
//        /done


//        problem 4

        rectangle myrectangle = new rectangle(4,5);

        double f =myrectangle.areaRectangle();
        System.out.println(f);













    }
}
