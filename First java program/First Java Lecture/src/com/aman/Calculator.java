package com.aman;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op =='/') {
                System.out.println("Enter the two input no");
                int num1=sc.nextInt();
                int num2=sc.nextInt();


                if (op=='+')
                {
                    ans =num1+num2;
                }
                if (op=='-')
                {
                    ans =num1-num2;
                }
                if (op=='*')
                {
                    ans =num1*num2;
                }
                if (op=='/')
                {
                    ans =num1/num2;
                }

            }else if(op=='x' || op=='X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid");
            }

         System.out.println("Answer is");
        System.out.println(ans);}
    }
}
