package com.bridgelabz.linecomparison;
import java.util.Scanner;

public class Linecomparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line comaprison problems.");
        //UC1:Calculate length of line.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1:");
        float x1 = sc.nextInt();
        System.out.println("Enter the value of y1:");
        float y1 = sc.nextInt();
        System.out.println("Enter the value of x1:");
        float x2 = sc.nextInt();
        System.out.println("Enter the value of y1:");
        float y2 = sc.nextInt();

        double Length =  Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("The length of line is:"+Length);

        //uC-2:To check equality of two lines.
        double l1,l2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1:");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of y1:");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of x2:");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y2:");
        
        int y2 = sc.nextInt();
        System.out.println("Enter the value of a1:");
        int a1 = sc.nextInt();
        System.out.println("Enter the value of b1:");
        int b1 = sc.nextInt();
        System.out.println("Enter the value of a2:");
        int a2 = sc.nextInt();
        System.out.println("Enter the value of b2:");
        int b2 = sc.nextInt();

        l1 =  Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        l2 =  Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
        System.out.println("Length of line l1 is:"+l1);
        System.out.println("Length of line l2 is:"+l2);

        if(l1 == l2)
        {
            System.out.println("Line l1 equals to Line l2.");
        }
        else
        {
            System.out.println("Line l1 is not equals to Line l2");
        }
    }
}
