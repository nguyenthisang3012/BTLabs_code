package com.BTLabs1_11;

import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        char mychar;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("Nhập ký tự cần kiểm tra: ");
            mychar=sc.nextLine().charAt(0);
            if (mychar <= 90 && mychar >= 65 || mychar <= 122 && mychar >= 97) {
                System.out.println("Ký tự nhập vào là chữ");
            } else if (mychar <= 57 && mychar >= 48) {
                System.out.println("Ký tự nhập vào là số");
            } else {
                System.out.println("Ký tự nhập vào là ký tự khác");
            }
        }while (mychar !=32);
    }
}
