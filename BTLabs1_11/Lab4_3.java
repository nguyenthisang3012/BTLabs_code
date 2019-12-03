package com.BTLabs1_11;

import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        int m,n;
        Scanner nb=new Scanner(System.in);
        System.out.println("Nhập m: ");
        m=nb.nextInt();
        System.out.println("Nhập n: ");
        n=nb.nextInt();
        if (m>0 && n>0) {
            for (int i = m; i < n; i++) {
                if (i%7==0){
                    System.out.println(i);
                }

            }
        }
    }
}
