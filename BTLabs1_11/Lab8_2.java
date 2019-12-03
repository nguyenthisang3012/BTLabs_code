package com.BTLabs1_11;

import java.util.Scanner;

public class Lab8_2 {
    public static int soKyTu(String s){
        int count=0;
        char[] s1=s.toCharArray();
        for (int i = 0; i <s1.length ; i++) {
            if (s1[i]==' ') continue;
            else count++;
        }
        return count;
    }
    public static char soNguyenAm_PhuAm(String s){
        int vowel=0,consonal=0;
        char[] s1=s.toCharArray();
        for (int i = 0; i <s1.length ; i++) {
            if (s1[i]=='u'||s1[i]=='U'||s1[i]=='e'||s1[i]=='E'||s1[i]=='i'
                ||s1[i]=='I'||s1[i]=='a'||s1[i]=='A'||s1[i]=='o'||s1[i]=='O')
                vowel++;
            else if ((s1[i]>='a'&&s1[i]<='z')||(s1[i]>='A'&&s1[i]<='Z'))
                consonal++;
        }
        System.out.println("Số nguyên âm: "+vowel);
        System.out.println("Số phụ âm: "+consonal);
        return ' ';
    }
    public static int soTu(String s){
        int i=0,count=1;
        char[] s1=s.toCharArray();
        while (s1[i]==' ') i++;
        for (int j = i; j <s1.length -1; j++) {
            if (s1[j]==' '&&s1[j+1]!=' ') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s=sc.nextLine();
        System.out.println("Số ký tự có trong chuỗi: "+soKyTu(s));
        System.out.println("Số từ có trong chuỗi: "+soTu(s));
        System.out.println(soNguyenAm_PhuAm(s));
    }
}
