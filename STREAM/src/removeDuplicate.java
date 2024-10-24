package src;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class removeDuplicate {
    public static void main(String[] args) {
        Set<Integer> sk = new HashSet<>();
            sk.add(1);
            sk.add(2);
            sk.add(1);
            sk.add(2);
            sk.add(3);
        System.out.println(sk);
        sk.stream()
                .distinct()
                .collect(Collectors.toList());
        sk.forEach(System.out::println);
    }
}
