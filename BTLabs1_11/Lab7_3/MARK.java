package com.BTLabs1_11.Lab7_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MARK {
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
        ArrayList<MARK> arr=new ArrayList<>();
        int choice;
        do {
            System.out.println();
            System.out.println("1-Nhap danh sach mon hoc");
            System.out.println("2-Hien thi danh sach");
            System.out.println("3-Diem trung binh cao nhat");
            System.out.println("4-Thoat");
            Scanner sc = new Scanner(System.in);
            System.out.println("Chon? ");
            choice = sc.nextInt();
            switch (choice){
            case 1:
                for (int i = 0; i < 2 ; i++) {
                    MARK mark = new MARK();
                    mark.NhapMonHoc();
                    arr.add(mark);
                }
                break;
            case 2:
                System.out.println("THONG TIN MON HOC");
                for (int i = 0; i <arr.size() ; i++) {
                    arr.get(i).XuatMonHoc();
                }
                break;
            case 3:
                float maxTemp= arr.get(0).TinhDTB();
                int i=0;
                while (i<arr.size()){
                    if (arr.get(i).TinhDTB()==maxTemp){
                        maxTemp=arr.get(i).TinhDTB();
                    }
                    i++;
                }
                System.out.println("Diem trung binh cao nhat la: "+maxTemp);
                break;
            case 4:
                System.out.println("Hen gap lai!");
                System.exit(0);
        }
        } while (choice!=4);
    }
}
