package com.company;

import java.io.FilterOutputStream;
import java.io.PushbackInputStream;
import java.sql.SQLOutput;

public class SH_34_2_Hard_Recursion_Question {
// === === === === === ==>QUESTION 1 <== === === === ==> TOWER OF HANOI <== === === === ===

    //    static void Hanoi(int n,String src, String help, String dest){
//        if (n==1){
//            System.out.println(" Transfer disk " + n + " from " + src + " to " + dest );
//            return;
//        }
//        Hanoi(n-1,src,dest,help);
//        System.out.println(" Transfer disk " + n + " from " + src + " to " + dest);
//        Hanoi(n-1,help,src,dest);
//    }


//=== === === === === === === === ==> Question 2 <== === === === ==>Print String in Reverse <== === === === ===
//    static void StringReverce(String str, int idx){
//        if (idx==0){
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.println(str.charAt(idx));
//        StringReverce(str,idx-1);
//
//
//    }

//-=== === === === ==> QUESTION 3 <== Find the First and Last occurrence of the element in the string === === === === ===

//    public static int first =-1;
//    public static int last =-1;
//    public static void occurrenceofelement(String str, int idx, char element){
//        if (idx == str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//
//        }
//        char currchar = str.charAt(idx);
//        if (currchar == element) {
//            if (first == -1) {
//                first = idx;
//            } else {
//                last = idx;
//            }
//        }
//
//        occurrenceofelement(str,idx+1,element);
//
//    }



//=== === === === === ==>   QUESTION 4 <==> Check whether the element is sorted or not <== === === === ===

//public static boolean issorted(int []arr, int idx) {
//    if (idx == arr.length - 1) {
//        return true;
//    }
//    if (arr[idx] <= arr[idx + 1]) {
//        return issorted(arr, idx + 1);
//
//    }else{
//        return false;
//    }
//}


//QUESTION 5 === === === Move all the x to the last of the string === === === === === === ===





    public static void main(String[] args) {

// === === === === === ==>QUESTION 1 <== === === === ==> TOWER OF HANOI <== === === === ===
//        int n= 3;
//        Hanoi(n,"S","H","D");

//=== === === === === === === === ==> Question 2 <== === === === ==>Print String in Reverse <== === === === ===

//        String str = "abcde";
//        StringReverce(str,str.length()-1);




//-=== === === === ==> QUESTION 3 <== Find the First and Last occurrence of the element in the string === === === === ===

//        String str ="abddfdbbasbsfbasbbsbsbaaabfbabab";
//        occurrenceofelement(str,0,'a');







//=== === === === === ==>   QUESTION 4 <==> Check whether the element is sorted or not <== === === === ===


//        int []arr ={1,2,3,4,5,6,7,5,7};
//        System.out.println(issorted(arr,0));



//QUESTION 5 === === === Move all the x to the last of the string === === === === === === ===







    }
}
