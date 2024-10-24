import org.w3c.dom.ls.LSOutput;

public class VowelCheckerExample {
    public static void main(String[] args) {
        String input ="HELLO WORLD";
        try {
            VowelChecker(input);
            System.out.println("the String contains a vowels ");
        }catch (NoVowelException e){
            System.out.println("vowel is not found : "+e.getMessage());
            e.printStackTrace();
        }
    }
    public static void VowelChecker(String input)throws NoVowelException{
        if (!input.matches(".*[AEIOUaeiou]*.")){
            throw new NoVowelException("the string is does not contains a vowels");
        }
    }
}
class NoVowelException extends Exception{
    public NoVowelException(String message){
        super(message);
    }
}