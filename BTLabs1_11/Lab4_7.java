package com.BTLabs1_11;

import java.util.Scanner;

public class Lab4_7 {
    public static boolean checkNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <=  (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("Nhập n = ");
            int n = sc.nextInt();
            System.out.print(String.format("%d số nguyên tố đầu tiên là: ", n));
            int count = 0;
            int i = 2;
            while (count < n) {
                if (checkNguyenTo(i)) {
                    System.out.print(i + " ");
                    count++;
                }
                i++;
            }
    }
}
