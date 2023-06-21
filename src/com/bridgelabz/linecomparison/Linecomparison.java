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


    }
}
