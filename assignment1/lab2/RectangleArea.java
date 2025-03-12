import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter length: ");
        int length = scanner.nextInt();

        System.out.print("enter width: ");
        int width = scanner.nextInt();

        int area = length * width;

        System.out.println("area of rectangle is: " + area);
        
        scanner.close();
    }
}
