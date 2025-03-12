
import java.util.Scanner;

public class negExp {

    public static void main(String[] args) {
        int arr[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();
        try {
            arr = new int[n];
            System.out.println("Created Succesfully!!");
        } catch (NegativeArraySizeException e) {
            System.out.println("Cant  have an array with negative size");
        }
    }
}
