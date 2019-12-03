package com.BTLabs1_11;

import java.util.Random;

public class Lab5_4 {
    public static void main(String[] args) {
        int a[] = new int[10], max, min, count1=0, count2=0;
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=rd.nextInt(50);
            System.out.println("a["+i+"]: "+a[i]);
        }
        max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if (max<a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if (max==a[i]){
                count1++;
            }
        }
        System.out.println("Giá trị lớn nhất là "+max+",số lần xuất hiện "+count1);
        min=a[0];
        for (int i = 0; i <a.length ; i++) {
            if (min>a[i]){
                min=a[i];
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if (min==a[i]){
                count2++;
            }
        }
        System.out.println("Giá trị nhỏ nhất là "+min+",số lần xuất hiện "+count2);
    }
}
