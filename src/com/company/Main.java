package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        String inputNumber1 = scanner.nextLine();
        System.out.println("Please enter another number");
        String inputNumber2 = scanner.nextLine();

        double operand1 = Double.parseDouble(inputNumber1);
        double operand2 = Double.parseDouble(inputNumber2);

        System.out.println("You entered " + operand1 + " and " + operand2);

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double divide = operand1 / operand2;
        double multiply = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResults(sum, difference, divide, multiply, remainder);

    }

    public static void showResults(double sum, double difference, double divide, double multiply, double remainder) {
        System.out.println("The sum of both numbers is " + sum);
        System.out.println("The difference of both numbers is " + difference);
        System.out.println("The result of the division of both numbers is " + divide);
        System.out.println("The result of the multiplication of both numbers is " + multiply);
        System.out.println("The remainder from a division of both numbers is " + remainder);
    }


}

