package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập a,b,c: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
            System.out.println("3 số bạn nhập là 3 cạnh của 1 tam giác.");
        }
        else {
            System.out.println("3 số bạn nhập không phải là 3 cạnh của 1 tam giác.");
        }
    }
}
