import java.util.*;

//Write a program that reads a list of integers from the console, removes duplicates,
//and prints the sorted unique numbers to the console using Java 8 streams
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .distinct()
                .sorted().forEach(System.out::println);
    }


}
