package Project;

import java.util.Scanner;

public class Calculator {

    private double num1;
    private double num2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter First Number:");
        double num1 = scan.nextDouble();
        calculator.setNumber1(num1);

        System.out.println("Enter Second Number : ");
        double num2 = scan.nextDouble();
        calculator.setNumber2(num2);

        System.out.println("Choose an option:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        double result;
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                result = calculator.add();
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calculator.subtract();
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calculator.multiply();
                System.out.println("Result: " + result);
                break;
            case 4:
                result = calculator.divide();
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        scan.close();
    }

    // Addition method
    private double add() {
        return num1 + num2;
    }

    // Subtraction method
    private double subtract() {
        return num1 - num2;
    }

    // Multiplication method
    private double multiply() {
        return num1 * num2;
    }

    // Division method
    private double divide() {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return num1 / num2;
    }

    // Setters for the numbers
    private void setNumber1(double num1) {
        this.num1 = num1;
    }

    private void setNumber2(double num2) {
        this.num2 = num2;
    }
}
