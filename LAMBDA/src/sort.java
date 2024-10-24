import java.util.Arrays;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        List<String> sk = Arrays.asList("d","c","b","a");
        sk.sort((s1,s2) -> s1.compareTo(s2));
        sk.forEach(System.out::println);
    }
}
