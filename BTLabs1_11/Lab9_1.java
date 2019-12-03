package com.BTLabs1_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab9_1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        List list = null;
        do {
            System.out.println("Demo cac thao tac tren ArrayList so nguyen Java");
            System.out.println("===============================================");
            System.out.println("1- khoi tao danh sach.");
            System.out.println("2- them 1 phan tu vao danh sach.");
            System.out.println("3- xoa 1 phan tu trong danh sach.");
            System.out.println("4- chen 1 phan tu vao danh sach.");
            System.out.println("5- duyet danh sach.");
            System.out.println("6- tim 1 phan tu.");
            System.out.println("7- sap xep danh sach tang dan.");
            System.out.println("8- sap xep danh sach giam dan.");
            System.out.println("0- thoat chuong trinh.");
            System.out.println("Moi chon: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ban vua khoi tao 1 danh sach.");
                    System.out.println("Nhap so phan tu cua danh sach.");
                    int n = sc.nextInt();
                    list = new ArrayList<>(n);
                    for (int i = 0; i < n; i++) {
                        list.add(rd.nextInt(10));
                    }
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + "  ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Nhap phan tu ban muon them vao danh sach.");
                    int a = sc.nextInt();
                    list.add(a);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + "  ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Nhap vi tri phan tu ban muon xoa trong danh sach");
                    int b = sc.nextInt();
                    list.remove(b);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + "  ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Nhap vi tri va phan tu ban muon chen vao danh sach.");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    list.add(c, d);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + "  ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Cac phan tu co trong danh sach.");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + "  ");
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Nhap phan tu ma ban muon tim.");
                    int e = sc.nextInt();
                    boolean resultCheck = list.contains(e);
                    if (resultCheck == true) {
                        System.out.println("Co phan tu " + e + " trong danh sach.");
                    } else {
                        System.out.println("Khong co phan tu 2 trong danh sach.");
                    }
                    break;
                case 7:
                    int tempSort = 0;
                    for (int i = 0; i < list.size() - 1; i++) {
                        for (int j = list.size() - 1; j >= 1; j--) {
//                            if (list.get(j) < list.get(j - 1)) {
//                                tempSort = (int) list.get(j);
//                                list.set(j, list.get(j - 1));
//                                list.set(j - 1, tempSort);
//                            }
                        }
                    }
                    System.out.println("Sap xep danh sach tang dan.");
                    for (int k = 0; k < list.size(); k++) {
                        System.out.print(list.get(k) + "  ");
                    }
                    System.out.println();
                    break;
                case 8:
                    int temp = (int) list.get(0);
                    for (int i = 0; i < list.size() - 1; i++) {
                        for (int j = i + 1; j < list.size(); j++) {
//                               if (list.get(j) > list.get(i)) {
//                                   temp = (int) list.get(j);
//                                   list.set(j, list.get(i));
//                                   list.set(i, temp);
//                               }
                        }
                    }
                    System.out.println("Sap xep danh sach giam dan.");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + "  ");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}