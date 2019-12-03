package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        float a,b,c,d,max1,max2,max,min1,min2,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập a,b,c,d: ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        d=sc.nextFloat();
        max1=a;
        max2=c;
        if (a<b) max1=b;
        if (c<d) max2=d;
        max=max1;
        if (max1<max2) max=max2;{
            System.out.println("Max: "+max);
        }
        min1=a;
        min2=c;
        if (a>b) min1=b;
        if (c>d) min2=d;
        min=min1;
        if (min1>min2) min=min2;{
            System.out.println("Min: "+min);
        }

    }
}
