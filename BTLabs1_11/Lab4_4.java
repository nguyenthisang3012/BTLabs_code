package com.BTLabs1_11;

import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("\tSO THICH CA NHAN");
        System.out.println("=======================");
        System.out.println("1. Doc sach");
        System.out.println("2. Nghe nhac");
        System.out.println("3. Choi the thao");
        System.out.println("4. May tinh");
        System.out.println("5. Thoat");
        System.out.println("=======================");
        System.out.print("Chon: ");
        choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Ban thich doc sach?");
                break;
            case 2:
                System.out.println("Ban thich nghe nhac?");
                break;
            case 3:
                System.out.println("Ban thich choi the thao?");
                break;
            case 4:
                System.out.println("Ban thich may tinh?");
                break;
            case 5:
                System.out.println("Hen gap lai!");
                System.exit(0);
            default:
                System.out.println("Ban da chon sai");
        }
    }
}
