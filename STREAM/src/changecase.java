import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class changecase {
    public static void main(String[] args) {
        List<String> sk = Arrays.asList("Sanjeev");
        List<String> uppercase = sk.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("UPPER CASE" + uppercase);
        List<String> lowercase = sk.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("LOWER CASE" + lowercase);

    }
}
