package com.aman;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);

        // float num =input.nextFloat();
       //   int num=input.nextInt();
       //  System.out.println(num);
     //TYPE CASTING
        int num =(int)(98.98f);
        System.out.println(num);

        //automatictic type promotion in expressions
        int a=257;
        byte b=(byte)(a);
        System.out.println(b);

        byte a1=40;
        byte b1=50;
        byte c1=100;
        int d=a1*b1/c1;

        System.out.println(d);

      /*  byte b2=20;
        b2=b2*2;
        System.out.println(b2);*/

        int number= 'a';
        System.out.println(number);

        int number1= 'b';
        System.out.println("नमस्ते");

        byte b3=42;
        char c3='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d3=0.1234;
        double result = (f*b3) + (i/c3) - (d3-s);
        System.out.println((f*b3) +" "+ (i/c3) +" "+ (d3-s));
        System.out.println(result);

    }
}
