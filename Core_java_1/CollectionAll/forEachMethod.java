import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethod {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 4, 5, 8, 9);

        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n) {
        // System.out.println(n);
        // }
        // };
        // num.forEach(con);

        num.forEach(n -> System.out.println(n));
    }
}
