import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the second number (y): ");
        double y = scanner.nextDouble();

        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (x < y) {
            System.out.println(y + " is greater than " + x);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
