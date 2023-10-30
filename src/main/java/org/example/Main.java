package org.example;

import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static double add(double a,double b){
        double c=a+b;
        System.out.println(a + " + " + b + " = " + c );
        return c;
    }
    public static double sub(double a,double b){
        double c=a-b;
        System.out.println(a + " - " + b + " = " + c );
        return c;
    }
    public static double mul(double a,double b){
        double c=a*b;
        System.out.println(a + " X " + b + " = " + c );
        return c;
    }
    public static double div(double a,double b){
        if(b == 0) {
            System.out.println("Cannot divide by zero");
            //if b == 0 then no value determinable, used zero to catch a failure.
            return 0;
        }
        else {
            double c=a/b;
            System.out.println(a + " / " + b + " = " + c);
            return c;
        }
    }
    public static void main(String[] args) {
        int mode=0;
        Scanner s=new Scanner(System.in);
        double a=0,b=0,c1=0;
        while(mode != 5){
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter the mode of calculation:");
            mode = s.nextInt();
            System.out.println(" ");
            switch(mode) {
                case 1:
                    System.out.println("Enter 1st number:");
                    a = s.nextDouble();
                    System.out.println("Enter 2nd number:");
                    b = s.nextDouble();
                    System.out.println(" ");
                    c1 = add(a, b);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter 1st number:");
                    a = s.nextDouble();
                    System.out.println("Enter 2nd number:");
                    b = s.nextDouble();
                    System.out.println(" ");
                    c1 = sub(a, b);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Enter 1st number:");
                    a = s.nextDouble();
                    System.out.println("Enter 2nd number:");
                    b = s.nextDouble();
                    System.out.println(" ");
                    c1 = mul(a, b);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Enter 1st number/dividend:");
                    a = s.nextDouble();
                    System.out.println("Enter 2nd number/divisor:");
                    b = s.nextDouble();
                    System.out.println(" ");
                    c1 = div(a, b);
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Exiting. Thank you.");
                    break;
                default:
                    System.out.println("Please enter valid input!");
            }
        }
    }
}