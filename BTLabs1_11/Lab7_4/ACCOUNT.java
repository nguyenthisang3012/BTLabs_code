package com.BTLabs1_11.Lab7_4;

public class ACCOUNT {
    private int STK;
    private String chuTK;
    private double soDu;
    private double laiSuat;//(0.045 -> 4.5%)

    public ACCOUNT(String chuTK, int STK, double soDu) {
        this.chuTK = chuTK;
        this.STK = STK;
        this.soDu = soDu;
    }

    public void tienBĐ() {
        System.out.printf("Số tiền trong tài khoản ban đầu của Bill là: %.3f\n",soDu);
    }

    public double GuiTien(double tienGui) {
        if (tienGui <= 0) {
            System.out.printf("Error: Số tiền gửi vào không hợp lệ, %d", STK);
        } else {
            soDu = soDu + tienGui;
        }
        return soDu;
    }

    public double RutTien(double tienRut) {
        if (tienRut < 0) {
            System.out.printf("Error: Số tiền rút ra không hợp lệ: %d", STK);
        }
        else if (tienRut > soDu) {
            System.out.printf("Error: Giao dịch rút tiền không được thực hiện. STK: %d", STK);
        }
        else {
            soDu = soDu - tienRut;
        }
        return soDu;
    }

    public double TienLai(double tienLai) {
        tienLai = soDu+(soDu*0.045);
        return tienLai;
    }

    public double getSoTaiKhoan() {
        return STK;
    }

    public double getSoDu() {
        return soDu;
    }
}

