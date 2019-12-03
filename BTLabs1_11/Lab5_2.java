package com.BTLabs1_11;

import java.util.Random;
import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {
        int integer[] = new int[10];
        double real[] = new double[5];
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        for (int i = 0; i <integer.length ; i++) {
            integer[i]=rd.nextInt(10);
            System.out.println("integer["+i+"]: "+integer[i]);
        }
        for (int i = 0; i <real.length ; i++) {
            System.out.print("real["+i+"]: ");
            real[i]=sc.nextInt();
        }
            for (int j = 0,i=0; j <real.length ; i++) {
                if (i % 2 == 0) {
                    integer[i] = 0;
                } else {
                    integer[i] = (int) real[j];
                    j++;
                }
        }
        for (int i = 0; i <integer.length ; i++) {
            System.out.println("integer["+i+"]: "+integer[i]);
        }
        for (int i = 0; i <real.length ; i++) {
            System.out.println("real["+i+"]: "+real[i]);
        }
    }
}
