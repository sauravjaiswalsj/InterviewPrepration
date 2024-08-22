/*
You are given a string s. Return the array of unique characters, sorted by highest to lowest occurring characters.

If two or more characters have same frequency then arrange them in alphabetic order.


Example 1
Input : s = "tree"

Output : ['e', 'r', 't' ]

Explanation : The occurrences of each character are as shown below :

e --> 2, r --> 1, t --> 1.

The r and t have same occurrences , so we arrange them by alphabetic order.

 */
package begineer.Strings;
import java.util.Comparator;
import java.util.HashMap;
import java .util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Collection;
import java.util.*;
import Template.StressTestTool;

class SortedMap implements Comparator<Map.Entry<Character, Integer>>{
    @Override
    public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer> m2){
        return m1.getValue().compareTo(m2.getValue());
    }
}
public class SortFrequencyMap {
    public static void main(String[] args) {
        String s = "tree";

        List<Character> st = frequencySort(s);
        System.out.println(st);
    }
    private static List<Character> frequencySort (String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        System.out.println();
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
        System.out.println();
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        SortedMap sortedMap = new SortedMap();
        list.sort(sortedMap);

        Set<Character> ans = map.keySet();
        System.out.println(map.keySet());

        return List.copyOf(ans);
    }
}
