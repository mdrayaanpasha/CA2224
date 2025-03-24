import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class read_from_one_write_in_other {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("new.txt"); 
            FileWriter writer = new FileWriter("destination.txt",true); 
            int character;
            while ((character = reader.read()) != -1) { 
                writer.write(character);
            }
            reader.close(); 
            writer.close(); 
        } catch (IOException e) {
            System.out.println("Shit's fucked: " + e);
        }
    }
}