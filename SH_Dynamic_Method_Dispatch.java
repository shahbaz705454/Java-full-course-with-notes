package com.company;

import java.util.Optional;

class Phone{
    public void ShowTime(){
        System.out.println("The Time is 9am");

    }
    public void On(){

        System.out.println("Turning On the Phone ........");
    }
}

class SmartPhone extends Phone{
    @Override
    public void On(){
        System.out.println("Turning Out the SmartPhone......");


    }
    public void PlayMusic(){
        System.out.println("Playing Music......");
    }


}


public class SH_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        Phone Nokia =new SmartPhone();
        Nokia.On();
        Nokia.ShowTime();
//        Nokia.PlayMusic();    //This is not allowed because it refers to super class you can those method those are available in both class


        SmartPhone Iphone =new SmartPhone();
        Iphone.On();
        Iphone.PlayMusic();


    }
}
