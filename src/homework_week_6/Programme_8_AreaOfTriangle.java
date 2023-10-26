package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the triangle: ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the triangle : ");
        int height = scanner.nextInt();
        areaOfTriangle(height, length);
        //closing the scanner object
        scanner.close();
    }

    //calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int height, int length) {
        int area = (height * length) / 2;
        System.out.println("The area of the triangle is : " + area);
    }
}
