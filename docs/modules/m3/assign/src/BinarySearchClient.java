import java.util.Arrays;
import java.util.Comparator;

/**
 * Client for BinarySearch.
 */
public class BinarySearchClient {


    public static void main(String[] args) {
        String[] words = {
            "one", "two", "three", "four", "four", "five", "one", "one", "one", 
            "two", "two", "two", "five", "five", "fifty", "fifty", "forty",
        };

        Comparator<String> asclexico = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        Arrays.<String>sort(words, asclexico);
        System.out.println(Arrays.toString(words));
        int location = BinarySearch.<String>firstIndexOf(words, "one", asclexico);
        System.out.println(location);
        location = BinarySearch.<String>lastIndexOf(words, "one", asclexico);
        System.out.println(location);

        Comparator<String> comparator = new BinarySearch.asclexicoPartial(1);
        Arrays.<String>sort(words, comparator);
        System.out.println(Arrays.toString(words));
        int start = BinarySearch.<String>firstIndexOf(words, "f", comparator);
        System.out.println(start);
        int end = BinarySearch.<String>lastIndexOf(words, "f", comparator);
        System.out.println(end);
        for (int i = start; i <= end; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }


    private static Comparator<String> asclexicoPartial(int length) {
        return new Comparator<String>() {
            public int compare(String s1, String s2) {
                String s1Substring = s1.substring(0, length);
                String s2Substring = s2.substring(0, length);
                return s1Substring.compareTo(s2Substring);
            }
        };
    }

}
