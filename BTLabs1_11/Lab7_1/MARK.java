package com.BTLabs1_11.Lab7_1;

import java.util.Scanner;

public class MARK {
    String TenMonHoc;
    float DiemLT;
    float DiemTH;
    public float TinhDTB() {
      return (DiemLT+DiemTH)/2;
    }
    public void NhapMonHoc() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên môn học: ");
        TenMonHoc=sc.nextLine();
        System.out.print("Nhập điểm lý thuyết: ");
        DiemLT=sc.nextInt();
        System.out.print("Nhập điểm thực hành: ");
        DiemTH=sc.nextInt();
    }
    public float XuatMonHoc(){
        System.out.println("THÔNG TIN VỀ MÔN HỌC:");
        System.out.println("================================");
        System.out.println("Điểm lý thuyết: "+DiemLT);
        System.out.println("Điểm thực hành: "+DiemTH);
        System.out.println("Điểm trung bình:"+TinhDTB());
        return (0);
    }
    public static void main(String[] args) {
        MARK mark=new MARK();
        mark.NhapMonHoc();
        mark.XuatMonHoc();
    }
}
