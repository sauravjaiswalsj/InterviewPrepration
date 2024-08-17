package JavaCollections;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueList {
    public static void main(String[] args){

        // Creates a PQ, used to solve problems of min heap.
        PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<>();
//
//        for (int i = 5; i >=1;){
//            priorityQueue.add(i);
//
//            i--;
//        }

        minPriorityQueue.add(5);
        minPriorityQueue.add(2);
        minPriorityQueue.add(8);
        minPriorityQueue.add(1);
        minPriorityQueue.forEach( x -> {
            System.out.println(x);
        });

        while(!minPriorityQueue.isEmpty()){
            System.out.println(minPriorityQueue.poll());
        }

        System.out.println();
        // Creates a PQ, used to solve problems of max heap.
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>((Integer a, Integer b) -> b-a);

        maxPriorityQueue.add(5);
        maxPriorityQueue.add(2);
        maxPriorityQueue.add(8);
        maxPriorityQueue.add(1);
        maxPriorityQueue.forEach( x -> {
            System.out.println(x);
        });

        while(!maxPriorityQueue.isEmpty()){
            System.out.println(maxPriorityQueue.poll());
        }

    }
}
