import java.util.Arrays;
import java.util.List;

//Write a program to find the largest number in an integer array using Java 8 streams.
public class Problem5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers.stream()
                .mapToInt(e->e)
                .max().orElse(0));
    }


}
