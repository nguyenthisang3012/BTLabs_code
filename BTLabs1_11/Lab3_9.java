package com.BTLabs1_11;

import java.util.Scanner;

public class Lab3_9 {
    public static void main(String[] args) {
        byte xa,ya,xb,yb,xc,yc,xd,yd;
        float AB,AC,BC,S,S1,S2,S3,AD,BD,CD,p,p1,p2,p3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tọa độ điểm A: ");
        xa=sc.nextByte();
        ya=sc.nextByte();
        System.out.println("Tọa độ điểm A ("+xa+";"+ya+")");
        System.out.println("Nhập tọa độ điểm B: ");
        xb=sc.nextByte();
        yb=sc.nextByte();
        System.out.println("Tọa độ điểm B ("+xb+";"+yb+")");
        System.out.println("Nhập tọa độ điểm C: ");
        xc=sc.nextByte();
        yc=sc.nextByte();
        System.out.println("Tọa độ điểm C ("+xc+";"+yc+")");
        AB= (float) Math.sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));
        AC= (float) Math.sqrt((xc-xa)*(xc-xa)+(yc-ya)*(yc-ya));
        BC= (float) Math.sqrt((xc-xb)*(xc-xb)+(yc-yb)*(yc-yb));
        if ((AB+AC>=BC)&&(AB+BC>=AC)&&(AC+BC>=AB)) {
            System.out.println("Ba điểm trên tạo thành 1 tam giác.");
            if (AB==AC&&BC==AC){
                System.out.println("Tam giác đều");
            }
            else if (AB==AC||AB==BC||BC==AC){
                if (AB*AB+AC*AC==BC*BC||AB*AB+BC*BC==AC*AC||BC*BC+AC*AC==AB*AB){
                    System.out.println("Tam giác vuông cân");
                }
                else {
                    System.out.println("Tam giác cân");
                }
            }
            else if (AB*AB+AC*AC==BC*BC||AB*AB+BC*BC==AC*AC||BC*BC+AC*AC==AB*AB){
                System.out.println("Tam giác vuông");
            }
            else {
                System.out.println("Tam giác thường");
            }
        }
        else {
            System.out.println("Ba điểm trên không tạo thành tam giác nào.");
        }
        System.out.println("Nhập tọa độ điểm D: ");
        xd=sc.nextByte();
        yd=sc.nextByte();
        System.out.println("Tọa độ điểm D ("+xd+";"+yd+")");
        p=(AB+AC+BC)/2;
        S=(float) Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
        AD= (float) Math.sqrt((xd-xa)*(xd-xa)+(yd-ya)*(yd-ya));
        BD= (float) Math.sqrt((xd-xb)*(xd-xb)+(yd-yb)*(yd-yb));
        CD= (float) Math.sqrt((xd-xc)*(xd-xc)+(yd-yc)*(yd-yc));
        p1=(AB+AD+BD)/2;
        S1=(float) Math.sqrt(p1*(p1-AB)*(p1-AD)*(p1-BD));
        p2=(AC+AD+CD)/2;
        S2=(float) Math.sqrt(p2*(p2-AC)*(p2-AD)*(p2-CD));
        p3=(BC+BD+CD)/2;
        S3=(float) Math.sqrt(p3*(p3-BC)*(p3-BD)*(p3-CD));
        if ((S1+S2+S3)==S){
            System.out.println("D thuộc tam giác ABC.");
        }
        else {
            System.out.println("D không thuộc tam giác ABC");
        }
    }
}
