package com.BTLabs1_11;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Lab9_2 {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=null;
        Random rd=new Random();
        do {
            System.out.println("Demo cac thao tac tren Stack so nguyen Java");
            System.out.println("1- khoi tao stack.");
            System.out.println("2- them 1 phan tu vao stack.");
            System.out.println("3- lay phan tu dau ra khoi stack.");
            System.out.println("4- xem phan tu dau stack.");
            System.out.println("5- duyet stack.");
            System.out.println("0- thoat chuong trinh.");
            System.out.println("Moi chon.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stack=new Stack<>();
                    System.out.println("Nhap so phan tu cua stack.");
                    int n=sc.nextInt();
                    for (int i = 0; i <n ; i++) {
                        stack.push(rd.nextInt());
                    }
                    System.out.println(stack);
                    break;
                case 2:
                    System.out.println("Nhap phan tu ban muon them vao stack.");
                    int a = sc.nextInt();
                    stack.add(a);
                    System.out.println("Ban vua them 1 phan tu vao stack.");
                    System.out.println(stack);
                    break;
                case 3:
                    System.out.println("Ban vua lay phan tu dau ra khoi stack.");
                    stack.pop();
                    break;
                case 4:
                    System.out.println("Phan tu dau danh sach.");
                    int s=stack.peek();
                    System.out.println(s);
                    break;
                case 5:
                    System.out.println(stack);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice!=0);
    }
}

