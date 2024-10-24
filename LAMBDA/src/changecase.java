import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class changecase {
    public static void main(String[] args) {
        List<String> sk = Arrays.asList("sanjeev","nithish","nikesh");
        System.out.println(sk);

        sk.replaceAll(str -> str.toLowerCase());
        System.out.println("LOWER CASE"+sk);
        sk.replaceAll(str -> str.toUpperCase(Locale.ROOT));
        System.out.println("UPPER CASE"+sk);
    }
}
