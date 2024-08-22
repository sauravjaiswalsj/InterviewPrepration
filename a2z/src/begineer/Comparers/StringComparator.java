package begineer.Comparers;
import java.util.Comparator;
import java.util.*;

// Implement a comparator to sort a list of strings by length, and then by lexicographic order:
public class StringComparator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("zebra", "banana", "cherry", "date", "apple");
        strings.sort(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if (a.length() == b.length())
                    return a.compareTo(b);

                return a.length() - b.length();
            }
        });
        System.out.println(strings);
    }
}
