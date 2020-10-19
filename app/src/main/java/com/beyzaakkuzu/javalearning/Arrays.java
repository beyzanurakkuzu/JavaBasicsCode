package com.beyzaakkuzu.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args){
        //array: birden çok veriyi bir arada tutmamızı sağlar.

        String[] myStringArray= new String[3];

        myStringArray[0]= "Java";
        myStringArray[1]= "C#";
        myStringArray[2]= "Python";
        System.out.println(myStringArray[1]);

        int[] myİntegerArray= new int[3];

        myİntegerArray[0]=23;
        myİntegerArray[1]=19;
        myİntegerArray[2]=14;
        System.out.println(myİntegerArray[1]);

        int[] myNumberArray= {1,2,4,5,6,7,8,9,0};
        System.out.println(myNumberArray[3]);

        //List : dizi listeleri diyebiliriz. Dizilerle hemen hemen  aynıdır. dizilere göre daha esnektir.

        ArrayList<String> myMusician= new ArrayList<String>();
        myMusician.add("Ali");
        myMusician.add("Ayşe");
        myMusician.add(1,"Kağan"); // index vermemiz önemli
        myMusician.add("Melisa");


        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));
        System.out.println(myMusician.get(3));

        //Set
        //HashSet
        HashSet<String> mySet= new HashSet<String>();
        mySet.add("Beyza");
        mySet.add("Beyza");

        System.out.println(mySet.size());

        //HashMap

        HashMap<String,String> myMap= new HashMap<String,String>();//2 değişken bekliyor. (anahtar kelime ve değer)
        myMap.put("name","Beyza");
        myMap.put("job","Engineer");

        System.out.println(myMap.get("name"));
        System.out.println(myMap.get("job"));

        HashMap<String, Integer> mySecondHashMap= new HashMap<String,Integer>(); //primitive:ilkel (int)
        mySecondHashMap.put("run",100);
        mySecondHashMap.put("basketball",300);

        System.out.println(mySecondHashMap.get("run"));

    }
}
