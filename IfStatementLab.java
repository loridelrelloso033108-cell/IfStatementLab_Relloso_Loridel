
/*
 * Java Lab Activity: Using If Statements,
 * Integer & Double Data Types, and Scanner
 *
 * Student: Loridel A. Relloso
 * Section: BSECE-1
 */

package ifstatementlab;

import java.util.Scanner;

public class IfStatementLab {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //====================================
        // Problem 1: Age Category Checker
        //====================================

        System.out.println("===== AGE CATEGORY CHECKER =====");
        System.out.print("Enter your age: ");

        int age = input.nextInt();

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age <= 19) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }


        //====================================
        // Problem 2: Temperature Evaluator
        //====================================

        System.out.println("\n===== TEMPERATURE EVALUATOR =====");
        System.out.print("Enter today's temperature in Celsius: ");

        double temperature = input.nextDouble();

        if (temperature < 0) {
            System.out.println("Freezing point.");
        } else if (temperature <= 25) {
            System.out.println("Normal weather.");
        } else {
            System.out.println("Hot weather.");
        }


        //====================================
        // Problem 3: Simple Grade Evaluator
        //====================================

        System.out.println("\n===== SIMPLE GRADE EVALUATOR =====");
        System.out.print("Enter your test score (0-100): ");

        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid input. Please enter a score from 0 to 100.");
        } else if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }


        //====================================
        // Problem 4: Circle Calculator
        //====================================

        System.out.println("\n===== CIRCLE CALCULATOR =====");
        System.out.print("Enter the radius of the circle: ");

        double radius = input.nextDouble();

        if (radius <= 0) {
            System.out.println("Invalid radius.");
        } else {
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);
        }


        //====================================
        // Problem 5: Even or Odd Number
        //====================================

        System.out.println("\n===== EVEN OR ODD =====");
        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }

        input.close();
    }
}
