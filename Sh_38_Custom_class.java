package com.company;


class employee{
    int id;
    int salary;
    String name;

    public void getdetail(){
        System.out.println("The id of the employee is " + id);
        System.out.println("The name of the employee is " + name);

    }
    public int getsalary(){
        return salary;
    }
}

public class Sh_38_Custom_class {
    public static void main(String[] args) {


        employee shahbaz = new employee();
         shahbaz.id=1;
         shahbaz.name="Mohammad shahbaz";
         shahbaz.salary=90;
         shahbaz.getdetail();
        System.out.println("the salary of the emplyee is " +shahbaz.getsalary());

     employee    shad =new employee() ;

        shad.id=2;
        shad.name="Mohammad Shad";
        shad.salary=50;
        shad.getdetail();
        System.out.println("the salary of the shad is " + shad.getsalary());



    }
}
