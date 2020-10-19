package com.beyzaakkuzu.javalearning;

import android.widget.Switch;

import java.sql.SQLOutput;
import java.util.jar.JarOutputStream;

public class Statements {
    public static void main(String[] args){

        //operatörler
        int x=5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x*3;
        System.out.println(x);

        int y=3;
        System.out.println(x>y); //boolean değer döner
        System.out.println(x<y); //false
        y=18;
        System.out.println(x>=y); //true
        System.out.println(x==y); //true
        System.out.println(x!=y); //false

        // "&&" and
        // "||" or
        int a=5;
        int b=6;
        int z=8;

        System.out.println(a<b && b<z); //true
        System.out.println(b>z || z<a); //false

        //if statements

        if(x<y){

            System.out.println("y is bigger"); //koşul geçerliyse çalışır
        }
        else if(x>y){
            System.out.println("x is bigger");
        }
        else{
            System.out.println("x=y");
        }

        //Switch : Değiştirmek
        int day=3;
        String dayString="1";
        if(day==1){
            dayString="Monday";
        }
        else if(day==2){
            dayString="Tuesday";
        }
        else{
            dayString="Wednesday";
        }
        System.out.println(dayString);




        switch(day) {
            case 1: {
                dayString = "Monday";
                break;
            }
            case 2: {
                dayString = "tuesday";
                break;
            }
            default:{
                dayString = "Saturday";
            }
            System.out.println(dayString);
        }
    }
}


