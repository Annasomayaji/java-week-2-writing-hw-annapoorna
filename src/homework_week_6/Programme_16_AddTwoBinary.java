package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */
public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to add two binary numbers");
        //sScanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter the first binary number");
        String first = scanner.nextLine();
        System.out.println("PLease enter second binary number");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The addition of two binary numbers is : " + addition);
        //Closing scanner object
        scanner.close();
    }

    //Adding the two binary numbers
    public static String addTwoBinaryNumbers(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}
