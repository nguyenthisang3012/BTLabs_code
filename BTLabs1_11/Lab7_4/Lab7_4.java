package com.BTLabs1_11.Lab7_4;

public class Lab7_4 {
    public static void main(String[] args) {
        ACCOUNT accbill = new ACCOUNT("Bill Gate", 12345, 100000);
        accbill.tienBĐ();
        System.out.println("Số tiền trong tài khoản của Bill trước khi gửi tiền vào là: " + accbill.TienLai(0));
        accbill.GuiTien(50000);
        accbill.RutTien(4200);
        System.out.println("Số tiền trong tài khoản của Bill sau khi rút tiền là: " + accbill.getSoDu());
        accbill.RutTien(200000);
    }
}