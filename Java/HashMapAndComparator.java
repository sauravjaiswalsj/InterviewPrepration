import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class HashMapAndComparator{

    public static void main(String[] args){
	    int[] arr = {1, 2, 3, 1, 1, 4};

	    int[] ans = getFrequencies(arr);
	    
	    System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] getFrequencies(int[] v) {
        // Write Your Code Here
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                return a.compareTo(b);
            }
        };
        Map<Integer, Integer> map = new TreeMap<>(comp);
        int n = v.length;
        for (int i = 0; i < n; i++){
            if (map.containsKey(v[i])){
                map.put(v[i], map.get(v[i])+1);
            }else{
                map.put(v[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int maxE = 0;
        int minE = 0;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if (value > max){
                max = value;
                maxE = entry.getKey();
            }

            if(value < min){
                min = value;
                minE = entry.getKey();
            }
        }

        return new int[] {maxE, minE};
    }
}


