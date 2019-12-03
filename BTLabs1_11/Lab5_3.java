package com.BTLabs1_11;

public class Lab5_3 {
    public static void main(String[] args) {
        int a[]=new int[20];
        int n1=1,n2=1,n3,n;
        System.out.println("a[0]: "+n1);
        System.out.println("a[1]: "+n2);
        for (int i = 2; i <a.length ; i++) {
            n3=n1+n2;
            System.out.println("a["+i+"]: "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
