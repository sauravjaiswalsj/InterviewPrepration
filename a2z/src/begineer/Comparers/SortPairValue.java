package begineer.Comparers;

// Implement a comparator to sort a list of pairs (key, value) by the value in ascending order:

import java.util.*;
class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public final K getKey()        { return key; }
    public final V getValue()      { return value; }
}
class PairComparator<K,V> implements Comparator<Pair<K,V>>{
    @Override
    public int compare(Pair<K,V> p1, Pair<K,V> p2){
        return (int)p1.getValue() - (int)p2.getValue();
    }
}
public class SortPairValue {
    public static void main(String[] args) {
        List<Pair<String, Integer>> pairs = new ArrayList<>();
        pairs.add(new Pair<>("apple", 3));
        pairs.add(new Pair<>("banana", 1));
        pairs.add(new Pair<>("cherry", 2));
        PairComparator pair = new PairComparator();

        pairs.sort(pair);

        for (Pair p : pairs){
            System.out.println(p.getKey()+ " " + p.getValue());
        }
         // [(banana, 1), (cherry, 2), (apple, 3)]
    }

}
