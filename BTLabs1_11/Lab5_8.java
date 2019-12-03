package com.BTLabs1_11;

import java.util.Scanner;

public class Lab5_8 {
    public static boolean checkKyTu(char n){
        if (n <= 122 && n >= 97 ) return true;
        else return false;
    }

    public static void main(String[] args) {
        char a[]=new char[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập ký tự chữ cái thường. ");
        for (int i = 0; i <a.length ; i++) {
            System.out.println("a["+i+"]: ");
            a[i]=sc.next().charAt(0);
        }
        System.out.println();
        for (int i = 0; i <a.length ; i++) {
            if (checkKyTu(a[i])){
             //   System.out.println("a["+i+"]: "+a[i]);
            } else {
                System.out.println("a["+i+"]: ");
                a[i]=sc.next().charAt(0);
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println("a["+i+"]: "+Character.toUpperCase(a[i]));
        }
    }
}
