
import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxValues {
    public static void main(String[] args) {
        List<Integer> sk = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(sk);
        Optional<Integer> min = sk.stream()
                .min(Integer::compareTo);
        System.out.println("MINIMUM VALUES " +min);
        Optional<Integer> max = sk.stream()
                .max(Integer::compareTo);
        System.out.println("MAXIMUM VALUE " +max);
    }
}
