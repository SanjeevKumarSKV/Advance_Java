import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class checkOddEven {
    public static void main(String[] args) {
        List<Integer> sk = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List <Integer> sk1 = sk.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        System.out.println("even"+sk1);
        List<Integer> sk2 = sk.stream()
                .filter(x -> x%2 != 0)
                .collect(Collectors.toList());
        System.out.println("odd"+sk2);

    }
}
