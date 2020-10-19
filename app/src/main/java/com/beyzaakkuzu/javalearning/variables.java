package com.beyzaakkuzu.javalearning;

public class variables {

    public static void main(String[] args){

        //Variables

        //Integer
        int a=5;
        int b=10;
        System.out.println(a*b);

        // Double - Float
        double c=3.1;
        double d=14.2;
        System.out.println(d/c);

        float e=1.1f;
        float f=11.1f;
        System.out.println(f-e);

        //dairenin çevresini hesaplama
        int r=5;
        double pi=3.14;
        System.out.println(2*pi*r);

        //String
        String name= "Hello";
        String surname="World";

        System.out.println(name);
        System.out.println(surname); //alt alta yazar

        System.out.println(name+" "+surname); //aynı satırda yazdırma

        //Boolean true or false
        boolean isAlive=true;
        isAlive= false;
        System.out.println(isAlive);

        //Final : Değerin değişmemesi için final kullanılabilir

        final int z=5;
        System.out.println("z:"+ z );
        //z=3;
        //System.out.println("z:"+ z);

    }
}
