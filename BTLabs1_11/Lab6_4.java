package com.BTLabs1_11;

import java.util.Scanner;

public class Lab6_4 {
    public static char Mark(float n){
        if (n<=3.9&&n>=0){
            return 'F';
        }
        if (n<=5.4&&n>=4){
            return 'D';
        }
        if (n<=6.9&&n>=5.5){
            return 'C';
        }
        if (n<=8.4&&n>=7){
            return 'B';
        }
        if (n<=10&&n>=8.5){
            return 'A';
        }
        else {
        return 'E';
        }
    }

    public static void main(String[] args) {
        float mark;
        Scanner sc=new Scanner(System.in);
        System.out.println("Mark? ");
        mark=sc.nextFloat();
        System.out.println(Mark(mark));
    }
}
