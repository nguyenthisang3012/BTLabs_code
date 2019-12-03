package com.BTLabs1_11;

import java.util.Scanner;

public class Lab6_2 {
    public static int power(int a,int n){
        return (int) Math.pow(a,n);
    }

    public static void main(String[] args) {
        int x,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập x: ");
        x=sc.nextInt();
        System.out.print("Nhập m: ");
        m=sc.nextInt();
        System.out.println(power(x,m));
    }
}
