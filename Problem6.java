import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Implement a method that takes a list of strings and returns a new list containing only the strings that are palindrome
public class Problem6 {
    public static void main(String[] args) {

        List<String> values = Arrays.asList("level", "Anna", "java", "civic", "Palindrome", "deified");

        System.out.println(
                values.stream()
                        .filter(Problem6::isPalindrom)
                        .collect(Collectors.toList())
        );
    }

    private static boolean isPalindrom(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
