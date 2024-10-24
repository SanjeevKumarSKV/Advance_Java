public class exceptionTest {
    public static void main(String[] args) {
         System.out.println("After try");
        try {
            int result = TestExceptionNotHandle();
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception not handle");
            e.printStackTrace();
        }
        int val = TestExceptionHandle();
        System.out.println("val TestExceptionHandle"+val);
    }
    public static int TestExceptionNotHandle(){
        int d = 10/0;
        return 0;
    }
    public static int TestExceptionHandle(){
        try{
            int d = 10/0;
        }catch (Exception e){
            System.out.println("exception inside testExceptionHandled method");
            e.printStackTrace();
        }finally {
            System.out.println("Finally test exception handle");
        }
        return 0;
    }
}