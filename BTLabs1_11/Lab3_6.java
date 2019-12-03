package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_6 {
    public static void main(String[] args) {
        char alp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập kí tự: ");
        alp=sc.next().charAt(0);
        if (alp<=90&&alp>=65||alp>=97&&alp<=122) {
           switch (alp){
               case 'o':
               case 'O':
               case 'e':
               case 'E':
               case 'u':
               case 'U':
               case 'i':
               case 'I':
               case 'a':
               case 'A':
                   System.out.println("Đây là nguyên âm.");
                   break;
               default:
                   System.out.println("Đây là phụ âm");
           }
        }
        else {
            System.out.println("Kí tự vừa nhập không thuộc bảng chữ cái. ");
        }
    }
}
