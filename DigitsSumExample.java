package com.demo;

import java.util.Scanner;

public class DigitsSumExample {

    public static int getDigitsSum(int input) {
        int digitsSum = 0;
        if (input < 0) {
            System.out.println("Invalid input. Must be non-negative.");
        } else {
            while (input > 0) {
                int remainder = input % 100;
                digitsSum += remainder;
                input /= 100;
            }
        }
        return digitsSum;
    }

    public static void main(String[] args) {
        System.out.println("I am From main method");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = scanner.nextInt();
        int digitsSum = getDigitsSum(input);
        System.out.println("Digits Sum: " + digitsSum);
        scanner.close();
        System.out.println("End of Program!!");
    }
}
