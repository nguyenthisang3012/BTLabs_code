package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        float a,b,c,delta,dt =0;
        Scanner pt=new Scanner(System.in);
        System.out.println("Nhập a: ");
        a=pt.nextInt();
        System.out.println("Nhập b: ");
        b=pt.nextInt();
        System.out.println("Nhập c: ");
        c=pt.nextInt();
        delta= b*b-4*a*c;
        dt= (float) Math.sqrt(delta);
        dt= Math.abs(delta);
        if (delta<0) {
            System.out.println("Phương trình vô nghiệm!");
        }
        else if (delta>0){
            System.out.println("Phương trình có 2 nghiệm là: ");
            System.out.println(((-b+dt)/(2*a)));
            System.out.println(((-b-dt)/(2*a)));
        }
        if (delta==0){
            System.out.println("Phương trình có nghiệm kép là: "+ (-b/(2*a)));
        }
    }
}
