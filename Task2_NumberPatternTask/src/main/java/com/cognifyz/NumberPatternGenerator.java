package com.cognifyz;

import java.util.Scanner;

public class NumberPatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("✨ Welcome to the Number Pattern Generator by Abhi!");
        System.out.print("Enter the number of rows you want in the pyramid: ");
        int rows = scanner.nextInt();

        int numCount = 1;

        for (int i = 1; i <= rows; i++) {
            // Print spaces for center alignment
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(numCount + " ");
                numCount++;
            }

            System.out.println(); // Move to next line
        }

        scanner.close();
    }
}
