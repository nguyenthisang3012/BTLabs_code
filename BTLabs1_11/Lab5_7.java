package com.BTLabs1_11;

import java.util.Scanner;

public class Lab5_7 {
    public static boolean checkNguyenTo(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n% j == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập đủ 5 phân tử là số nguyên tố. ");
        for (int i = 0; i <a.length ; i++) {
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
            if (checkNguyenTo(a[i])) {
                System.out.println("a["+i+"]: "+a[i]);
            } else {
                System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
            }
        }
        System.out.println("5 phần tử nguyên tố: ");
        for (int i = 0; i <a.length ; i++) {
            System.out.println("a["+i+"]: "+a[i]);
        }
    }

}
