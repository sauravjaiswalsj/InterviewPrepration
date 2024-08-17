package JavaCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
public class ComparatorList implements Comparator<Integer> {
    public static void main(String[] args) {

        Integer[] list = {10,6,2,4,15,9,4,3,1,7,5};

        //sort in ascending
        Arrays.sort(list,new ComparatorList());

        Arrays.stream(list).forEach(x -> System.out.println(x));

        System.out.println();

        // sort in descending
        Arrays.sort(list,(Integer a, Integer b) -> b-a);


        Arrays.stream(list).forEach(x -> System.out.println(x));
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
