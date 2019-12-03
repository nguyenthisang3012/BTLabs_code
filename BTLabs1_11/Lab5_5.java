package com.BTLabs1_11;

import java.util.Scanner;

public class Lab5_5 {
    public static void main(String[] args) {
        int a[]=new int[10],x,count=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println("a["+i+"]: "+a[i]);
        }
        System.out.print("Nhập phần tử x: ");
        x=sc.nextInt();
        for (int i = 0; i <a.length ; i++) {
            if (x == a[i]) {
                count++;
            }
        }
        if (count>0){
            System.out.println("x có trong mảng a");
        }
        else {
            System.out.println("x không có trong mảng a");
        }
        for (int i = 0; i <a.length ; i++) {
            if (x==a[i]){
                System.out.println("Vị trí đầu tiên x xuất hiện là a["+i+"]: "+a[i]);
                break;
            }
        }
        System.out.println("Số lần xuất hiện là: "+count);

    }
}
