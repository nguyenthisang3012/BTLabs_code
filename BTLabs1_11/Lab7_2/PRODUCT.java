package com.BTLabs1_11.Lab7_2;

import java.util.ArrayList;
import java.util.Scanner;

public class PRODUCT {
   private String Tensp;
   private int Soluong, Dongia;

    private int tinhTongTien() {
       return Soluong*Dongia;
    }

    private void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        Tensp = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        Soluong = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        Dongia = sc.nextInt();
    }

    private void xuatThongTin() {

        System.out.print(String.format("|%-5d|%-15s|%8d|%10d|%13d|\n",1,Tensp, Soluong, Dongia, tinhTongTien()));
    }

    public static void main(String[] args) {
        ArrayList<PRODUCT> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            PRODUCT product = new PRODUCT();
            product.nhapThongTin();
            arr.add(product);
        }
        System.out.println("DANH MUC SAN PHAM");
        System.out.println("---------------------------------------------------------");
        System.out.printf("|%-5s|%-15s|%8s|%10s|%13s|\n","STT","Ten san pham","So luong","Don gia($)","Tong tien($)");
        System.out.println("|-------------------------------------------------------|");
        int tong=0;
        for (int i = 0; i <arr.size(); i++) {
            arr.get(i).xuatThongTin();
             tong+=arr.get(i).tinhTongTien();
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("|%55d|",tong));
        System.out.println("---------------------------------------------------------");

    }
}
