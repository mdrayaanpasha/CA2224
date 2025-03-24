import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter FW = new FileWriter("new.txt",true); //here i wrote true cause i wanna append!!
            FW.write("LADADA DA ITS THE M D O double G");
            FW.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
