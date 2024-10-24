public class TryCatchBlock {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("div tition by zero is not available");
            e.printStackTrace();
        }
    }
    public static int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("cannot divided by zero");
        }
        return a/b;
    }
}
