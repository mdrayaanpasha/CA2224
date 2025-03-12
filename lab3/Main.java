
import java.util.Scanner;

class Calc {

    float a, b;

    Calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = scanner.nextFloat();
        System.out.print("Enter second number: ");
        b = scanner.nextFloat();
    }

    public float add() {
        return a + b;
    }

    public float subtract() {
        return a - b;
    }
}

class AdvancedCalc extends Calc {

    public float multiply() {
        return a * b;
    }

    public float divide() {

        return a / b;

    }
}

public class Main {

    public static void main(String[] args) {
        AdvancedCalc calculator = new AdvancedCalc();

        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());

        System.out.println("Multiplication: " + calculator.multiply());
        float divisionResult = calculator.divide();

        System.out.println("Division: " + divisionResult);

    }
}
