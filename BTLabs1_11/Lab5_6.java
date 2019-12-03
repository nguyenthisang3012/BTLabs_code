package com.BTLabs1_11;

import java.util.Random;
import java.util.Scanner;

public class Lab5_6 {
    public static void main(String[] args) {
        int a[] = new int[20],x;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        for (int i = 0; i <a.length ; i++) {
            a[i]=rd.nextInt(20);
            System.out.println("a["+i+"]: "+a[i]);
        }
        System.out.print("Nhập x: ");
        x=sc.nextInt();
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%x==0){
                System.out.println("a["+i+"]: "+a[i]);
            }
        }
    }
}
