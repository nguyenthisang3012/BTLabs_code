package com.BTLabs1_11;

import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String name=sc.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        char kyTu=sc.next().charAt(0);
        int count=0;
        for (int i = 0; i <name.length() ; i++) {
            if (kyTu==name.toLowerCase().charAt(i)) count++;
        }
        System.out.println("Số lần xuất hiện là: "+count);
    }
}
