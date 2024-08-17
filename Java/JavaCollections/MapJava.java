package JavaCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapJava {
    public static void main(String[] args){
        Map<Integer, Boolean> map = new HashMap<>();

        map.put(1, true);
        map.put(2, true);
        map.put(5, true);
        map.put(3, null);

        map.putIfAbsent(3, true);
        map.putIfAbsent(4, false);

        // returns the set view of the map
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()){
            int key = entry.getKey();
            boolean value = entry.getValue();

            System.out.println("Key: " + key + " Value: "+ value);
        }

        map.put(null,false);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(9, false));
        System.out.println(map.containsKey(1));
        System.out.println(map.remove(null));

        Set<Integer> set = map.keySet();
        Collection<Boolean> collectionValue = map.values();


    }
}
