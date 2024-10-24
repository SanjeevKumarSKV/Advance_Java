import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> sk = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sk);
        List<Integer> even = sk.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("EVEN" + even);
        List<Integer> odd = sk.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("ODD" + odd);

    }
}
