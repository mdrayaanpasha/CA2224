import java.io.File;
import java.io.IOException;


class createFile{

   public static void main(String[] args) {
    File f = new File("new.txt");
    try{
        if(f.createNewFile()){
            System.out.println("File Created");
        }else{
            System.out.println("Files already there");
        }
    }catch(Exception e){
        System.out.println("Error: "+e);
    }
   }
}
