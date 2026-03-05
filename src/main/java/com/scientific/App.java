package com.scientific;

import java.util.Scanner;

public class App {

    // Basic operations
    
    // Addition Function
    public static double add(double a, double b){
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b){
        return a-b;
    }

    // Multiplication
    public static double multiply(double a, double b){
        return a * b;
    }

    // Division
    public static double divide(double a, double b){
        return a / b;
    }

    // Percentage
    public static double percentage(double total, double percentage){
        return (total * percentage) / 100;
    }

    // Square Root Function
    public static double squareRoot(double x){
        return Math.sqrt(x);
    }

    // Factorial Function
    public static long factorial(int x){
        long result = 1;
        for (int i = 1; i <= x; i++){
            result = result * i;
        }
        return result;
    }

    // Natural Log Function
    public static double naturalLog(double x){
        return Math.log(x);
    }

    // Power Function
    public static double power(double x, double b){
        return Math.pow(x, b);
    }

    // Sine Function
    public static double sine(double x){
        return Math.sin(x);
    }

    // Cosine Function
    public static double cosine(double x){
        return Math.cos(x);
    }

    // Tangent Function
    public static double tangent(double x){
        return Math.tan(x);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Percentage");
            System.out.println("6. Square Root");
            System.out.println("7. Factorial");
            System.out.println("8. Natural Log");
            System.out.println("9. Power");
            System.out.println("10. Sine");
            System.out.println("11. Cosine");
            System.out.println("12. Tangent");
            System.out.println("13. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double a1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b1 = sc.nextDouble();
                    System.out.println("Result: " + add(a1, b1));
                    break;
                
                case 2:
                    System.out.print("Enter first number: ");
                    double a2 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b2 = sc.nextDouble();
                    System.out.println("Result: " + subtract(a2, b2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    double a3 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b3 = sc.nextDouble();
                    System.out.println("Result: " + multiply(a3, b3));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    double a4 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b4 = sc.nextDouble();
                    System.out.println("Result: " + divide(a4, b4));
                    break;

                case 5:
                    System.out.print("Enter total value: ");
                    double total = sc.nextDouble();
                    System.out.print("Enter percentage: ");
                    double percent = sc.nextDouble();
                    System.out.println("Result: " + percentage(total, percent));
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Result: " + squareRoot(num1));
                    break;

                case 7:
                    System.out.print("Enter number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Result: " + factorial(num2));
                    break;

                case 8:
                    System.out.print("Enter number: ");
                    double num3 = sc.nextDouble();
                    System.out.println("Result: " + naturalLog(num3));
                    break;
                
                case 9:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter power: ");
                    double pow = sc.nextDouble();
                    System.out.println("Result: " + power(base, pow));
                    break;

                case 10:
                    System.out.print("Enter angle (in radians): ");
                    double angle1 = sc.nextDouble();
                    System.out.println("Result: " + sine(angle1));
                    break;

                case 11:
                    System.out.print("Enter angle (in radians): ");
                    double angle2 = sc.nextDouble();
                    System.out.println("Result: " + cosine(angle2));
                    break;

                case 12:
                    System.out.print("Enter angle (in radians): ");
                    double angle3 = sc.nextDouble();
                    System.out.println("Result: " + tangent(angle3));
                    break;

                case 13:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}