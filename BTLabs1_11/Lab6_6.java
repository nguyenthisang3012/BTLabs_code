package com.BTLabs1_11;

import java.util.Scanner;

public class Lab6_6 {
    public static boolean checkSoHoanHao(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n% i == 0)
                sum+=i;
        }
        if (sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Các số hoàn hảo có trong mảng là: ");
        for (int i = 0; i <a.length ; i++) {
            if (checkSoHoanHao(a[i]))
                System.out.println("a["+i+"]:"+a[i]);
        }
    }
}
