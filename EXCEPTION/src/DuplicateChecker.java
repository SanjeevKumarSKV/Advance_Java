import com.sun.jdi.request.DuplicateRequestException;

import java.sql.SQLSyntaxErrorException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChecker {
    public static void main(String[] args) throws DuplicateNumberException , NumberFormatException  {
        Scanner sk = new Scanner(System.in);
        Set<Integer>  numbers = new HashSet<>();
        System.out.println("enter the number (type 'exit' to finish) : ");
        while(true){
            String input = sk.nextLine();
            if(input.equalsIgnoreCase("exit")) {
                break;
            }
            try{
                int number = Integer.parseInt(input);
                if(!numbers.add(number)){
                    throw new DuplicateNumberException("Dupicate number found "+number);
                }
            }catch (DuplicateNumberException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }catch (NumberFormatException e){
                System.out.println("invalid input : please enter an integer or type 'exit' to finish");
                e.printStackTrace();
            }
        }
        System.out.println("no duplicate found . numbers entered :"+numbers);
    }
}
class DuplicateNumberException extends Exception{
    public DuplicateNumberException(String message){
        super(message);
    }
}