public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            arr[11] = 9;

        } catch (IndexOutOfBoundsException e) {
            System.out.println("You Can't Access Indexes that are beyond what were assigned!");
        }



        try {
            int num1 = Integer.parseInt("YELLO WORLD!");
        } catch (NumberFormatException e) {
            System.out.println("Error Converting!");
        }

        
    }    
}
