package com.BTLabs1_11.Lab4_1;

import java.util.Scanner;

public class Lab4_1_2b {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        //Câu 2b_Lab2
        while (n < 0) {
            System.out.println("Nhập lại n: ");
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
