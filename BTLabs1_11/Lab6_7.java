package com.BTLabs1_11;

import java.util.Scanner;

public class Lab6_7 {
    public static void Menu(){
        char choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("+=========================================+");
        System.out.println("|            MENU                         |");
        System.out.println("+=========================================+");
        System.out.println("| 1. Menu 1                               |");
        System.out.println("| 2. Menu 2                               |");
        System.out.println("| 3. Menu 3                               |");
        System.out.println("| 4. Menu 4                               |");
        System.out.println("| 5. Exit                                 |");
        System.out.println("+=========================================+");
        System.out.print("\t Please choose: ");
        choice=sc.next().charAt(0);
        while (choice>'5'){
            System.out.print("Enterd incorectly, re-enter: ");
            choice=sc.next().charAt(0);
        }
        switch (choice){
            case '1':
                System.out.println("doing menu 1...");
                break;
            case '2':
                System.out.println("doing menu 2...");
                break;
            case '3':
                System.out.println("doing menu 3...");
                break;
            case '4':
                System.out.println("doing menu 4...");
                break;
            case '5':
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}
