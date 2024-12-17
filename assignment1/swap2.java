
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
                int a = s.nextInt();
                int b=s.nextInt();

                System.out.printf("BEFORE SWAPPING: %d & %d\n",a,b);
                a=a+b;
                b=a-b;
                a=a-b;


                System.out.printf("AFTER SWAPPING: %d & %d",a,b);

    }
}
