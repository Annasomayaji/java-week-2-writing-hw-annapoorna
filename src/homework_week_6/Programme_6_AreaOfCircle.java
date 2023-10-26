package homework_week_6;

import java.util.Scanner;

/**
 * Write a programme to enter any radius value of the circle and find out the area.
 * (Formula of area A= PI*r*r)
 */
public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        //closing the Scanner object
        scanner.close();
    }

    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The area of circle is :" + area);
    }
}
