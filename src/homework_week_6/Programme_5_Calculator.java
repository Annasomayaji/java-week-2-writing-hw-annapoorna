package homework_week_6;

import java.util.Scanner;

/**
 * Write a programme for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use concatenation methods
 * (Note:two static and two instance methods)
 */
public class Programme_5_Calculator {
    //static methods
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is " + result);
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    //instance methods
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is " + result);
    }

    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number : ");
        int b = scanner.nextInt();

        addition(a, b);

        int subresult = subtraction(a, b);
        System.out.println("The subtration of " + a + " and " + b + " is " + subresult);

        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a, b);

        int divresult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is " + divresult);
        //closing the scanner object
        scanner.close();
    }
}
