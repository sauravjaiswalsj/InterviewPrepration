package JavaCollections;

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;

public class ListCollection {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        // add to collection
        for (int i = 1; i < 11; i+= 2){
            list.add(i);
        }
        list.forEach((Integer val) -> System.out.println(val));
        list.add(1,99);
        list.forEach((Integer val) -> System.out.println(val));

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            int val = iterator.next();

            if (val == 3)
                iterator.remove();
            System.out.println(val);
        }

        list.forEach((Integer val) -> System.out.println(val));

        list.get(1);
        Set<Integer> set = new HashSet<>();


    }
}
