package com.BTLabs1_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1_1 {
    int year;
    double weight, height, tb;
    String cn,name,ht ;
    char gender;
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\t +Nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("\t +Nhập năm sinh: ");
        year = sc.nextInt();
        System.out.print("\t +Nhập giới tính(F/M): ");
        gender = sc.next().charAt(0);
        System.out.print("\t +Nhập chiều cao: ");
        height = sc.nextDouble();
        System.out.print("\t +Nhập cân nặng: ");
        weight = sc.nextDouble();
        System.out.print("\t +Nhập quê quán: ");
        sc.nextLine();
        ht = sc.nextLine();
        System.out.print("\t +Nhập chuyên ngành: ");
        cn = sc.nextLine();
        System.out.print("\t +Nhập điểm trung bình: ");
        tb = sc.nextDouble();
    }
    public void xuatThongTin(){
        System.out.println("\t +Họ tên: " + name);
        System.out.println("\t +Năm sinh: " + year);
        System.out.println("\t +Giới tính: " + gender);
        System.out.println("\t +Chiều cao: " + height);
        System.out.println("\t +Cân nặng: " + weight);
        System.out.println("\t +Quê quán: " + ht);
        System.out.println("\t +Chuyên ngành: " + cn);
        System.out.println("\t +Điểm trung bình: " + tb);
    }

    public static void main(String[] args) {
        ArrayList<Lab1_1> arr=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            System.out.println("***Mời nhập ứng viên số "+(i+1)+": ");
             Lab1_1 Lab1 =new Lab1_1();
             Lab1.nhapThongTin();
             arr.add(Lab1);
        }
        System.out.println("===========================================");
        System.out.println("Danh sách các ứng viên vừa nhập: ");
        System.out.println("===========================================");
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println("***Ứng viên số "+(i+1)+": ");
            arr.get(i).xuatThongTin();
        }
    }
}
