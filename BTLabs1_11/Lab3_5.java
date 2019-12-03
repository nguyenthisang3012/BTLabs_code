package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_5 {
    public static void main(String[] args) {
    int km,tien;
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập số km: ");
    km=sc.nextInt();
    if (km<=1){
        tien=15000;
        System.out.println("Số tiền phải trả là: "+tien);
    }
    if(km<=5&&km>1) {
        tien=15000+(km-1)*13500;
        System.out.println("Số tiền phải trả là: "+tien);
    }
    tien=15000+4*13500+(km-5)*11000;
    if (km>120) {
        tien= (int) (tien*(1-0.1));
        System.out.println("Số tiền phải trả là: "+tien);
    }
    }
}
