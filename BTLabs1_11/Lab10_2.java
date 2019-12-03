package com.BTLabs1_11;

import java.util.Random;
import java.util.Scanner;

public class Lab10_2 {
    public static void main(String[] args) {
        int a[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = rd.nextInt(1000);
            }
        }
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10 - 1; i++) {
                for (int j = 10 - 1; j > i; j--) {
                    if (a[k][j] < a[k][j - 1]) {
                        int temp = a[k][j];
                        a[k][j] = a[k][j - 1];
                        a[k][j - 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
            for (int j = 0; j < 10; j++) {
                System.out.print("\t" + a[i][j]);
            }
        }
        System.out.println();
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i][j] == x) { System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);break; }
            }
        }
    }
}
