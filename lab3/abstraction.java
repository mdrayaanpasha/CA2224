
import java.util.*;

abstract class MathOp {

    abstract int add(int a, int b);

    int sub(int a, int b) {
        return a - b;
    }
}

class MathThing extends MathOp {

    public int add(int a, int b) {
        return a + b;
    }
}

public class abstraction {  // Renamed from 'abstract'

    public static void main(String[] args) {
        MathOp mo = new MathThing();
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first number");
        a = s.nextInt();
        System.out.println("Enter second number");
        b = s.nextInt();
        System.out.println("Sum of them is: " + mo.add(a, b));  // prints 15
        System.out.println("Diff of them is: " + mo.sub(a, b));   // prints 2
    }
}
