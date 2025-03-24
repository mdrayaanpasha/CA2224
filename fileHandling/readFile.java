import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {
        try(FileReader FR = new FileReader("new.txt")){
            int character;
            while((character = FR.read()) != -1){
                System.out.print((char)character);
            }
        }catch(IOException e){
            System.out.println("File's messed! " + e);
        }
    }
}

