package com.BTLabs1_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab9_4 {
    String s_code;
    String s_name;
    int s_age;
    float s_mark;
    Scanner sc=new Scanner(System.in);
    public void input_student()//nhập thông tin 1 sinh viên
    {
        System.out.print("Nhập tên sinh viên: ");
        s_name=sc.nextLine();
        System.out.print("Nhập mã số sinh viên: ");
        s_code=sc.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        s_age=sc.nextInt();
        System.out.print("Nhập điểm trung bình của sinh viên: ");
        s_mark=sc.nextFloat();
    }
    public void output_student()//xuất thông tin 1 sinh viên
    {
        System.out.println("Tên sinh viên: "+s_name);
        System.out.println("Mã số sinh viên: "+s_code);
        System.out.println("Tuổi của sinh viên: "+s_age);
        System.out.println("Điểm trung bình: "+s_mark);
    }
    //kiểm tra xem sinh viên có được học bổng không (nếu s_mark>8)?
    public boolean check_scholarship()
    {
        if (s_mark>8)return true;
        else return false;
    }
    public String get_name()//trả về tên sinh viên
    {
        return s_name;
    }
    public String get_code()//trả về mã sinh viên
    {
        return s_code;
    }
    public Float get_mark()//trả về ĐTB của sinh viên
    {
        return s_mark;
    }
    public void set_mark(float newMark)//sửa điểm cho sinh viên
    {
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Chuong trinh quan ly danh sach sinh vien su dung ArrayList:   ");
        System.out.println("=============================================================");
        ArrayList<Lab9_4> DSSV=null;
        do {
            System.out.println("1- khoi tao danh sach.");
            System.out.println("2- them 1 sinh vien vao danh sach.");
            System.out.println("3- duyet danh sach.");
            System.out.println("4- tim thong tin sinh vien theo ten sinh vien.");
            System.out.println("5- sua diem cho sinh vien.");
            System.out.println("6- danh sach sinh vien duoc nhan hoc bong.");
            System.out.println("7- xem diem cua sinh vien.");
            System.out.println("8- sap xep danh sach giam dan theo DTB.");
            System.out.println("9- sap xep danh sach giam dan theo DTB,tang dan theo ten.");
            System.out.println("0- thoat chuong trinh.");
            System.out.print("Moi chon: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    DSSV=new ArrayList<>();
                    System.out.print("Nhap so luong sinh vien: ");
                    int n=sc.nextInt();
                    for (int i = 0; i <n; i++) {
                        Lab9_4 sv=new Lab9_4();
                        sv.input_student();
                        DSSV.add(sv);
                    }
                    System.out.println("Danh sach sinh vien: ");
                    for (int i = 0; i <DSSV.size() ; i++) {
                        DSSV.get(i).output_student();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Nhap thong tin sinh vien moi: ");
                    for (int i = 0; i <1; i++) {
                        Lab9_4 sv=new Lab9_4();
                        sv.input_student();
                        DSSV.add(sv);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Danh sach sinh vien moi: ");
                        System.out.println(DSSV);
                    System.out.println();
                    break;
            }
        } while (choice!=0);

    }
}
