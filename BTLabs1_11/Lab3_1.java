package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        float A,B,C;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập A: ");
        A=sc.nextFloat();
        System.out.println("Nhập B: ");
        B=sc.nextFloat();
        if (B==0){
            System.out.println("Error:divide by zero");
        }
        else {
            C=A/B;
            System.out.println("C= "+C);
        }
    }
}
