package com.BTLabs1_11;

import java.util.Scanner;

public class Lab4_6 {
    public static void main(String[] args) {
        int n1=1,n2=1,n3,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số phần tử fibonacy: ");
        n=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i <n ; i++) {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
