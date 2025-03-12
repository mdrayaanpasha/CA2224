
public class strlenght {

    public static void main(String[] args) {
        String str = null;
        try {
            int n = str.length();
            System.out.println("Size of String is: " + n);
        } catch (NullPointerException e) {
            System.out.println("Empty String!!");
        }
    }
}
