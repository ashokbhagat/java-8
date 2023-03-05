import java.util.*;
import java.util.stream.*;

//Implement a method that takes a list of strings and returns a new list
// containing only the strings that start with a capital letter.
public class Problem2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ab", "Bc", "CD", "de", "eF");

        System.out.println(names.stream()
                .filter(Problem2::isFirstLetterCap)
                .collect(Collectors.toList()));
    }

    private static boolean isFirstLetterCap(String value) {
        return (value != null && Character.isUpperCase(value.charAt(0)));
    }
}
