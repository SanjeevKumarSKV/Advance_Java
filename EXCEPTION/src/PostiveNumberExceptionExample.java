import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PostiveNumberExceptionExample {
    public static void main(String[] args) {
        try{
            readnumber ("number.txt");
        }catch (PositiveNumberException e){
            System.out.println("caugth exception : "+e.getMessage());
            e.printStackTrace();
        }catch (FileNotFoundException e) {
            System.out.println("caugth exception : file not found " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void readnumber(String filename) throws FileNotFoundException , PositiveNumberException{
        File file =new File(filename);
        if (!file.exists()){
            throw new FileNotFoundException("the file "+filename+" was not found");
        }
        Scanner sk = new Scanner(file);
        while(sk.hasNextLine()){
            String s = sk.nextLine();
             try{
                int number = Integer.parseInt(s.trim());
            if(number > 0){
                throw new PositiveNumberException("the number "+number+" is positive");
            }
                 System.out.println("read number : "+number);
             }catch (NumberFormatException e){
                 System.out.println("invalid number formate : "+s);
             }
        }
    }
}
class PositiveNumberException extends Exception{
    public PositiveNumberException(String message){
        super(message);
    }
}