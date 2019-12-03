package com.BTLabs1_11;

import java.util.Scanner;

public class Lab6_3 {
    public static long Fibo(long n){
        int n1=1,n2=0,n3=0;
        for (int i = 0; i <n ; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n3;
    }

    public static void main(String[] args) {
        long n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập n: ");
        n=sc.nextLong();
        System.out.println(Fibo(n));
    }
}
