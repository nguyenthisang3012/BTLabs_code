package com.BTLabs1_11;

import java.util.Scanner;

public class Lab6_1 {
    public static void GiaiPTb2(float a,float b,float c){
        float dt=0,delta;
        delta=b*b-4*a*c;
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
            System.out.println("Phương trình có nghiệm kép là: "+(-b/(2*a)));
        }
    }

    public static void main(String[] args) {
        float a,b,c;
        Scanner pt=new Scanner(System.in);
        System.out.print("Nhập a: ");
        a=pt.nextInt();
        System.out.print("Nhập b: ");
        b=pt.nextInt();
        System.out.print("Nhập c: ");
        c=pt.nextInt();
        GiaiPTb2(a,b,c);
    }
}
