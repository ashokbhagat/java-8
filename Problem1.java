import java.util.*;

//Problem : Write a program to find the sum of all even numbers in an integer array using Java 8 streams.
public class Problem1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(e -> e)
                        .sum());


    }
}
