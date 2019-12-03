package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_8 {
    public static void main(String[] args) {
        float a,b;
        char choice;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        a=sc.nextFloat();
        System.out.print("Nhap so thu hai: ");
        b=sc.nextFloat();
        System.out.println("\t\t\tMENU");
        System.out.println("===========================");
        System.out.println("+");
        System.out.println("-");
        System.out.println("x");
        System.out.println(":");
        System.out.println("===========================");
        System.out.print("Chon: ");
        choice=sc.next().charAt(0);
        switch (choice){
            case '+':
                System.out.println("Tong: "+a+" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println("Hieu: "+a+" - "+b+" = "+(a-b));
                break;
            case 'x':
                System.out.println("Tich: "+a+" x "+b+" = "+(a*b));
                break;
            case ':':
                System.out.println("Thuong: "+a+" : "+b+" = "+(a/b));
            default:
                System.out.println("Ban chon sai phep toan");

        }



    }
}
