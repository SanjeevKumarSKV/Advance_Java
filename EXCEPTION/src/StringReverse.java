public class StringReverse {
    public static void main(String[] args) {
        String s = "hello";
        for (int i = s.length()-1 ; i >= 0 ; i--){
            System.out.println(s.charAt(i));
        }
    }
}