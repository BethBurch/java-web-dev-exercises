package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) { //psvm tab
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Radius of your circle?: ");
        double radius = input.nextInt(); // Radius has to be  a double type because its how its used in circle

        double circle = Circle.getArea(radius); //this line is calling the class circle that holds the method getArea that holds the math
        System.out.println("The area of your circle is: " + circle);

    }
}
