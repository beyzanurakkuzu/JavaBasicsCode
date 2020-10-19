package com.beyzaakkuzu.javalearning;

public class Loops {
    public static void main(String[] args){
        //for loop
        //genel olarak dizilerle kullanılır
        //bir koşul verilir ve koşul sonlanana kadar devam eder
        int[] myNumbers= {1,3,5,7,11,13,17,21,24};
        int x= myNumbers[8] /4* 5;
        //System.out.println(x);

        for (int i=0;i< myNumbers.length; i++){
            int a= myNumbers[i]/3* 5;
            //System.out.println(a);
        }

        for(int number : myNumbers){
            //System.out.println(number);
        }

        for(int a =0; a <10; a++){
            int b = a * 3;
            System.out.println(b);
        }

        //While :"şu olurken" anlamına geliyor.

        int c=3;
        while(c<10){
            int m=c*5;
            System.out.println(m);
            c++;
        }
    }
}
