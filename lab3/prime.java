
import java.util.Scanner;

public class prime {

    boolean prime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        prime p = new prime();
        Scanner s = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int num = s.nextInt();

        if (p.prime(num)) {
            System.out.println("Its a Prime Number");
        } else {
            System.out.println("Not a prime");
        }

    }
}
