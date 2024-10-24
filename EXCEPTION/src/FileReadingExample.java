import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingExample {
    public static void main(String[] args) {
    try {
        readFile("example.txt");
    }catch (FileNotFoundException e){
        System.out.println("caugth Exception : " +e.getMessage());
        e.printStackTrace();
    }
    }
    public static void readFile(String filename)throws FileNotFoundException{
        File file = new File(filename);
        if(!file.exists()){
            throw new FileNotFoundException("the file " +filename+ " was not found");
        }
        Scanner sk =new Scanner(filename);
        while(sk.hasNextLine()) {
            String s = sk.nextLine();
            System.out.println(s);
        }
    }
}