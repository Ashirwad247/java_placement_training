import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Randomss {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("prefixssum", "largest contagious array", "group anagrams", "print all permutations of string");

        // Generate a random index
        Random rand = new Random();
        int randomIndex = rand.nextInt(s.size());

        // Print the value at the random index
        System.out.println(s.get(randomIndex));
    }
}
