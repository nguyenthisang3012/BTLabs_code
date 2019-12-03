package com.BTLabs1_11.Lab4_1;

import java.util.Scanner;

public class Lab4_1_2c {
    static class Lietkesonguyento {
        boolean checkNguyenTo(int n) {
            if (n < 2) {
                return false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0)
                        return false;
                }
            }
            return true;
        }

        void xuatNguyenTo(int n) {
            for (int i = 2; i <= n; i++) {
                if (checkNguyenTo(i)) {
                    System.out.print(" " + i);
                }
            }
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Lietkesonguyento lk = new Lietkesonguyento();
            int n;
            System.out.println("Nhập n: ");
            n = sc.nextInt();
            while (n < 1) {
                System.out.println("Nhập lại n: ");
                n = sc.nextInt();
            }
            System.out.println("Các số nguyên tố nhỏ hơn n là: ");
            lk.xuatNguyenTo(n);
        }
    }
}
