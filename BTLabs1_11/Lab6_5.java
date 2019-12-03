package com.BTLabs1_11;

import java.util.Scanner;

public class Lab6_5 {
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
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            System.out.println("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Các số nguyên tố có trong mảng là: ");
        for (int i = 0; i <a.length ; i++) {
            if (checkNguyenTo(a[i]))
            System.out.println("a["+i+"]:"+a[i]);
        }
    }
}
