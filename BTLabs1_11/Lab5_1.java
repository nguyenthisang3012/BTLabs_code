package com.BTLabs1_11;

import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length ; i++) {
            System.out.print(String.format("Nhập a[ %d ] :", i));
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            if (i%2==0) {
                System.out.println(String.format("a[ %d ] :", i) + a[i]);
            }
        }
    }
}
