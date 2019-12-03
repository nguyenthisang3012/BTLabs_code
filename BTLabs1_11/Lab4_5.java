package com.BTLabs1_11;

import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        int n,sotach,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập n: ");
        n=sc.nextInt();
        for (;n!=0;){
            sotach=n%10;
            s+=sotach;
            n /=10;
        }
        System.out.println("Tổng là: "+s);
    }
}
