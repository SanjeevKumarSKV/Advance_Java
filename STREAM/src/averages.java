import java.util.Arrays;
import java.util.List;

public class averages {
    public static void main(String[] args) {
        List<Integer> sk = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(sk);
        Double avg = sk.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                        .orElse(10);

        System.out.println(" AVERAGE " + avg);

    }
}