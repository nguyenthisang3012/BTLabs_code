package com.BTLabs1_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab10_3 {
    String TenMonHoc;
    float DiemLT;
    float DiemTH;
    float DiemTB;
    public float TinhDTB() {
        return this.DiemTB=(DiemLT+DiemTH)/2;
    }
    public void NhapMonHoc() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên môn học: ");
        TenMonHoc=sc.nextLine();
        System.out.print("Nhập điểm lý thuyết: ");
        this.DiemLT=sc.nextInt();
        System.out.print("Nhập điểm thực hành: ");
        this.DiemTH=sc.nextInt();
    }
    public float XuatMonHoc(){
        System.out.println();
        System.out.println("Tên môn học: "+TenMonHoc);
        System.out.println("Điểm lý thuyết: "+DiemLT);
        System.out.println("Điểm thực hành: "+DiemTH);
        System.out.println("Điểm trung bình:"+TinhDTB());
        return (0);
    }
    public static void main(String[] args) {
        ArrayList<Lab10_3> arr=new ArrayList<>();
        for (int i = 0; i <8 ; i++) {
            Lab10_3 mark=new Lab10_3();
            mark.NhapMonHoc();
            arr.add(mark);
        }
        float temp=0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = arr.size() - 1; j >= 1; j--) {
                if (arr.get(j).TinhDTB() < arr.get(j - 1).TinhDTB()) {
                    temp = arr.get(j).TinhDTB();
                    arr.get(j).TinhDTB()=arr.get(j - 1).TinhDTB();
                    arr.get(j - 1).TinhDTB()=temp;
                }
            }
        }
        for (int i = 0; i <arr.size() ; i++) {
            arr.get(i).XuatMonHoc();
        }
    }
}
