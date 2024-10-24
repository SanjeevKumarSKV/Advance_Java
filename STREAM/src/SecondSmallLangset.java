import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondSmallLangset {
    public static void main(String[] args) {
        List<Integer> sk = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(sk);
        Optional<Integer> min = sk.stream()
                .sorted()
                .skip(1)
                        .min(Integer::compareTo);

        System.out.println("SECOND MINIMUM VALUE " +min);
        Optional<Integer> max = sk.stream()
                .sorted((a,b) -> b-a)
                .skip(1)
                        .max(Integer::compareTo);
        System.out.println("SECOND MAXIMUM VALUE " +max);
    }
}