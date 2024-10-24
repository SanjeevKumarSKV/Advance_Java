//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/>
import java.util.function.BiFunction;
public class sum {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(" sum " + biFunction.apply(10, 20));
    }
}