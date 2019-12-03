package com.BTLabs1_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Lab9_3 {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        Queue<Integer> queue=null;
        Random rd=new Random();
        do {
            System.out.println("Demo cac thao tac tren Queue so nguyen Java");
            System.out.println("1- khoi tao queue.");
            System.out.println("2- them 1 phan tu vao queue.");
            System.out.println("3- lay phan tu dau ra khoi queue.");
            System.out.println("4- xem phan tu dau queue.");
            System.out.println("5- duyet queue.");
            System.out.println("0- thoat chuong trinh.");
            System.out.println("Moi chon.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    queue=new LinkedList<>();
                    System.out.println("Nhap so phan tu cua stack.");
                    int n=sc.nextInt();
                    for (int i = 0; i <n ; i++) {
                        queue.add(rd.nextInt());
                    }
                    System.out.println(queue);
                    break;
                case 2:
                    System.out.println("Nhap phan tu ban muon them vao queue.");
                    int a = sc.nextInt();
                    queue.add(a);
                    System.out.println("Ban vua them 1 phan tu vao queue.");
                    System.out.println(queue);
                    break;
                case 3:
                    System.out.println("Ban vua lay phan tu dau ra khoi queue.");
                    queue.poll();
                    break;
                case 4:
                    System.out.println("Phan tu dau danh sach.");
                    int s=queue.element();
                    System.out.println(s);
                    break;
                case 5:
                    System.out.println(queue);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice!=0);
    }
}
