import com.sun.source.doctree.EscapeTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmptyFileExceptionExample {
    public static void main(String[] args) {
        try{
            readfile("example.txt");
        }catch (EmptyFileException e){
            System.out.println("caught Exception : "+e.getMessage());
            e.printStackTrace();
        }catch (FileNotFoundException e){
            System.out.println("caught Exception : "+e.getMessage());
            e.printStackTrace();
        }
    }
    public static void readfile(String filename) throws EmptyFileException , FileNotFoundException {
        File file = new File(filename);
        if(!file.exists()){
            throw new FileNotFoundException("the file "+filename+" is not found");
        }
        Scanner sk = new Scanner(file);
        if(!sk.hasNextLine()){
            sk.close();
            throw new EmptyFileException("the file "+filename+"is empty");
        }
        while(sk.hasNextLine()) {
            String s = sk.nextLine();
            System.out.println(s);
        }
    }
}
class EmptyFileException extends Exception{
    public EmptyFileException(String message){
        super(message);
    }
}