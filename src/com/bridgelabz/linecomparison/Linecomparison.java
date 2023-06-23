package com.bridgelabz.linecomparison;
import java.util.Scanner;

public class Linecomparison {

    public void method1() {
        //uC-To check equality of two lines by using equals().
        double l1, l2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1:");
        float x1 = sc.nextInt();
        System.out.println("Enter the value of y1:");
        float y1 = sc.nextInt();
        System.out.println("Enter the value of x1:");
        float x2 = sc.nextInt();
        System.out.println("Enter the value of y1:");
        float y2 = sc.nextInt();
        System.out.println("Enter the value of a1:");
        int a1 = sc.nextInt();
        System.out.println("Enter the value of b1:");
        int b1 = sc.nextInt();
        System.out.println("Enter the value of a2:");
        int a2 = sc.nextInt();
        System.out.println("Enter the value of b2:");
        int b2 = sc.nextInt();

        l1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        l2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        String str1 = l1+" ";//to convert double value to string value by invoking .tostring()
        String str2 = l2+" ";

        System.out.println("Length of line l1(string) is:" + str1);
        System.out.println("Length of line l2(string) is:" + str2);

        if (str1.equals(str2)) {
            System.out.println("Line l1 equals to Line l2.");//we use equals method to check equality of two strings
        } else {
            System.out.println("Line l1 is not equals to Line l2");
        }
    }
    public void method2() {
    //UC:To calculate whether one line is equal,greater or less than other line using compareTo()
        double l1,l2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a1:");
        int a1 = sc.nextInt();
        System.out.println("Enter the value of b1:");
        int b1 = sc.nextInt();
        System.out.println("Enter the value of a2:");
        int a2 = sc.nextInt();
        System.out.println("Enter the value of b2:");
        int b2 = sc.nextInt();

        System.out.println("Enter the value of p1:");
        int p1 = sc.nextInt();
        System.out.println("Enter the value of q1:");
        int q1 = sc.nextInt();
        System.out.println("Enter the value of p2:");
        int p2 = sc.nextInt();
        System.out.println("Enter the value of q2:");
        int q2 = sc.nextInt();

        l1 =  Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
        l2 =  Math.sqrt(Math.pow((p2-p1),2) + Math.pow((q2-q1),2));
        String str1 = l1+" ";//to convert double value to string value by invoking .tostring()
        String str2 = l2+" ";
        System.out.println("Length of line l1(in str) is:"+str1);
        System.out.println("Length of line l2(in str) is:"+str2);

        if (str1.compareTo(str2)==1)//1 means positive result.
        {
            System.out.println("Line l1 greater than Line l2.");
        }
        else if (str1.compareTo(str2)==-1)
        {
            System.out.println("Line l1 less than Line l2.");
        }
        else
        {
            System.out.println("Line l1 is equals to Line l2");
        }
    }

    public static void main(String[] args) {
      Linecomparison lc = new Linecomparison();
        lc.method2();
        lc.method1();



    }
}
