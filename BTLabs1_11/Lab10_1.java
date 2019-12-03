package com.BTLabs1_11;

import java.util.Scanner;

public class Lab10_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n=sc.nextInt();
        while (n<0){
            System.out.print("Nhập lại: ");
            n=sc.nextInt();
        }
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j]= arr[j - 1];
                    arr[j - 1]=temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arr["+i+"]: "+arr[i]);
        }
    }
}
