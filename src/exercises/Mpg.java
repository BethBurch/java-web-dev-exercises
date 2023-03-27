package exercises;
import java.util.Scanner;
public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        int miles = input.nextInt();
        System.out.println("How many gallons of Gas was used: ");
        int gallons = input.nextInt();
        System.out.println("Your car gets " + (miles / gallons) + " Mpg!!");
    }
}