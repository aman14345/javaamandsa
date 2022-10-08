package com.aman;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter  the temperature in celsius");
        float celsius=sc.nextInt();
        float fahrenheit=(celsius*9/5) + 32;
        System.out.println(fahrenheit);
    }
}
