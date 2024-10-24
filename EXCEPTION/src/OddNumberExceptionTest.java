public class OddNumberExceptionTest {
    public static void main(String[] args) {
        try {
            oddcheck(2);
        } catch (OddNumberException e) {
            System.out.println("not odd number");
             e.printStackTrace();
        }
        try {
            oddcheck(3);
        } catch (OddNumberException e) {
            System.out.println(" odd number");
            e.printStackTrace();
        }
    }
    public static void oddcheck(int a) throws OddNumberException{
        if(a%2 != 0){
            throw new OddNumberException("the number is odd");
        }
    }
}
class OddNumberException extends Exception{
    public OddNumberException(String message){
        super(message);
    }
}