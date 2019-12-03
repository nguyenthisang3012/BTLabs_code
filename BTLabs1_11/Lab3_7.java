package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_7 {
    public static void main(String[] args) {
        int choicenb;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t\t\tMENU");
        System.out.println("============================");
        System.out.println("1. CF");
        System.out.println("2. C");
        System.out.println("3. HDJ");
        System.out.println("4. DreamWeaver");
        System.out.println("5. RDBMS");
        System.out.println("6. Learn Java By Example");
        System.out.println("============================");
        System.out.print("Chon: ");
        choicenb=sc.nextInt();
        switch (choicenb){
            case 1:
                System.out.println("Ban chon CF?");
                break;
            case 2:
                System.out.println("Ban chon C?");
                break;
            case 3:
                System.out.println("Ban chon HDJ?");
                break;
            case 4:
                System.out.println("Ban chon DreamWeaver?");
                break;
            case 5:
                System.out.println("Ban chon RDBMS?");
                break;
            case 6:
                System.out.println("Ban chon Learn Java By Example?");
                break;
            default:
                System.out.println("Ban da chon sai");

        }
    }
}
