package com.BTLabs1_11;

import java.util.Scanner;

public class Lab8_4 {
    public String xoaKhoangTrang(String s){
        s=s.trim(); //xoa khoang trang dau va giua cau.
        s=s.replaceAll("\\s+"," "); //xoa cac khoang trang thua giua cau.
        return s;
    }
    public void inHoa(String s) {
        s = xoaKhoangTrang(s);
        char[] s1 = s.toCharArray();
        int i;
        boolean Space = false;
        for (i = 0; i < s1.length; i++) {
            if (i == 0 && s1[i] != ' ' && s1[i] != '\t') {
                if (s1[i] <= 'z' && s1[i] >= 'a') {
                    s1[i] = (char) (s1[i] - 32);
                }
            }
            if (s1[i] == ' ' || s1[i] == '\t') {
                Space = true;
            } else if (Space) {
                if (s1[i] <= 'z' && s1[i] >= 'a') {
                    s1[i] = (char) (s1[i] - 32);
                }
                Space = false;
            }
        }
        System.out.println(s1);
    }
        public static void main (String[]args){
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập chuỗi: ");
            s = sc.nextLine();
            Lab8_4 chuoi=new Lab8_4();
            System.out.println(chuoi.xoaKhoangTrang(s));
            chuoi.inHoa(s);
    }
}

