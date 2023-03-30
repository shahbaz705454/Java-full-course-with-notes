package com.company;

class myemployee2 {
    private int id;
    private String name;

    public  myemployee2(){
        id=0;
        name="Your-Name-Here";

    }

    public myemployee2(String myname,int myid){
        id=myid;
        name=myname;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}



public class SH_42_Constructor {
    public static void main(String[] args) {

        myemployee2 shahbaz =new myemployee2("shahbaz",2);
        System.out.println(shahbaz.getid());
        System.out.println(shahbaz.getname());






    }
}
