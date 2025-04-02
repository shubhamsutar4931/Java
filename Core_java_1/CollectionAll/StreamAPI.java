import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2, 4, 5, 8, 9);

        // one stream only use once

        Stream<Integer> s1 = num.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // Working of filter
        // Predicate<Integer> p= n->n%2==0;

        // Working of map
        // Function<Integer,Integer> fun= n-> n*2;

        // Working of reduce
        // Stream<Integer> sortedValue = num.stream()
        // .filter(n -> n % 2 == 0)
        // .sorted();
        // sortedValue.forEach(n -> System.out.println(n));

        // onother method for stream
        // int result = num.stream()
        // .filter(n -> n % 2 == 0) // .filter(p)
        // .map(n -> n * 2) // .map(fun)
        // .reduce(0, (c, e) -> c + e);

        // System.out.println(result);

        // old method
        // int sum = 0;
        // for (int n : num) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }
        // System.out.println(sum);
    }

}
