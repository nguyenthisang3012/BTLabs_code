package com.BTLabs1_11;

import java.util.Scanner;

public class Lab4_8 {
    public static void main(String[] args) {
        int a,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập n: ");
        n=sc.nextInt();
        System.out.println("Số nhị phân của "+n+" là: ");
        while (n!=0){
            a=n%2;
            n=n/2;
            System.out.print(a);
        }
    }
}
