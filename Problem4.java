import java.util.Arrays;
import java.util.List;

//Implement a method that takes a list of integers
//and returns the average of all the numbers in the list using Java 8 streams
public class Problem4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers.stream()
                .mapToInt(e->e)
                .average());
    }


}
