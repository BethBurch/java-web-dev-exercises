package exercises;
import java.util.Scanner;
public class Numeric {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle: ");
        int length = input.nextInt();
        System.out.println("Enter the Width of the Rectangle: ");
        int width = input.nextInt();
        System.out.println("The area of your Rectangle is: " + (width*length));
    }
}
