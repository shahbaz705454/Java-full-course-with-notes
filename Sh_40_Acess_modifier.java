package com.company;

class myemployee{
   private int id;
   private String name;

   public void setname(String n){
       name = n;
   }
   public String getname(){
       return name;
   }
   public void setid(int i){
       id =i ;

   }
   public int getid(){
       return id;
   }
}

public class Sh_40_Acess_modifier {
    public static void main(String[] args) {

        myemployee shahbaz =new myemployee();
       shahbaz.setname("Mohd shahbaz");
       shahbaz.setid(786);
        System.out.println("the name of the employee is " + shahbaz.getname());
        System.out.println("The id of the employee is  " + shahbaz.getid());




    }
}
