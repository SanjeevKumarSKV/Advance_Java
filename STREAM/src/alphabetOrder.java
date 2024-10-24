
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class alphabetOrder {
    public static void main(String[] args) {
        List<String> sk = Arrays.asList("a","c","b","e","d");
        System.out.println(sk);
        List<String> ascending = sk.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("ASCENDING ORDER " +ascending);
        List<String> desending = sk.stream()
                .sorted((s1,s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println("DESENDING ORDER " +desending);
    }
}
