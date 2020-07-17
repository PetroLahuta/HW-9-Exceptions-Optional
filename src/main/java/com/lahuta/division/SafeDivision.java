package main.java.com.lahuta.division;

import java.util.Scanner;

public class SafeDivision {
    public void resultsOfdivision() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("\nTask 2 ");

        try {
            int divisionResult = a / b;
            System.out.println(divisionResult + "\n--------------------------------------------------");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0. Please try again." +
                    "\n--------------------------------------------------");
        }
    }
}