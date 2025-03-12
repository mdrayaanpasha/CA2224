import java.util.*;

class Main {

  

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }


    

    int diff(int a, int b) {
        return a - b;
    }

    float diff(float a, float b) {
        return a - b;
    }

    int product(int a, int b) {
        return a * b;
    }

    float product(float a, float b) {
        return a * b;
    }


    int div(int a, int b) {
        return a / b;
    }

    float div(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        int choice;
        Scanner s = new Scanner(System.in);
        Main obj = new Main();  

        while (true) {
            System.out.println("PRESS 1 to Add default types");
            System.out.println("PRESS 2 to Add two floats");
            System.out.println("PRESS 3 to subtract default types");
            System.out.println("PRESS 4 to subtract two floats");
            System.out.println("PRESS 5 to multiply default types");
            System.out.println("PRESS 6 to multiply two floats");
            System.out.println("PRESS 7 to divide default types");
            System.out.println("PRESS 8 to divide two floats");

            choice = s.nextInt();

            switch (choice) {
                
                case 1:
                    {
                        int a, b;
                        System.out.println("Enter A: ");
                        a = s.nextInt();
                        System.out.println("Enter B: ");
                        b = s.nextInt();
                        System.out.println("RESULT OF INTEGER ADDITION IS: " + obj.sum(a, b));
                        break;
                    }
                case 2:
                    {
                        float a, b;
                        System.out.println("Enter A: ");
                        a = s.nextFloat();
                        System.out.println("Enter B: ");
                        b = s.nextFloat();
                        System.out.println("RESULT OF FLOAT ADDITION IS: " + obj.sum(a, b)
                        );      break;
                    }
                case 3:
                    {
                        int a, b;
                        System.out.println("Enter A: ");
                        a = s.nextInt();
                        System.out.println("Enter B: ");
                        b = s.nextInt();
                        System.out.println("RESULT OF INTEGER DIFFERENCE IS: " + obj.diff(a, b));
                        break;
                    }
                case 4:
                    {
                        float a, b;
                        System.out.println("Enter A: ");
                        a = s.nextFloat();
                        System.out.println("Enter B: ");
                        b = s.nextFloat();
                        System.out.println("RESULT OF FLOAT DIFFERENCE IS: " + obj.diff(a, b));
                        break;
                    }
                    case 5:
                    {
                        int a, b;
                        System.out.println("Enter A: ");
                        a = s.nextInt();
                        System.out.println("Enter B: ");
                        b = s.nextInt();
                        System.out.println("RESULT OF INTEGER MULTIPLICATION IS: " + obj.product(a, b));
                        break;
                    }
                case 6:
                    {
                        float a, b;
                        System.out.println("Enter A: ");
                        a = s.nextFloat();
                        System.out.println("Enter B: ");
                        b = s.nextFloat();
                        System.out.println("RESULT OF FLOAT PRODUCT IS: " + obj.product(a, b)
                        );      break;
                    }
                case 7:
                    {
                        int a, b;
                        System.out.println("Enter A: ");
                        a = s.nextInt();
                        System.out.println("Enter B: ");
                        b = s.nextInt();
                        System.out.println("RESULT OF INTEGER DIVISION IS: " + obj.div(a, b));
                        break;
                    }
                case 8:
                    {
                        float a, b;
                        System.out.println("Enter A: ");
                        a = s.nextFloat();
                        System.out.println("Enter B: ");
                        b = s.nextFloat();
                        System.out.println("RESULT OF FLOAT DIVISION IS: " + obj.div(a, b)
                        );      break;
                    }
                default:
                    System.out.println("PLEASE CHOOSE APPROPRIATE CHOICE");
                    break;
            }
        }
    }
}
