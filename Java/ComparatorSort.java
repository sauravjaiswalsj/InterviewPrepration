import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ComparatorSort{
	public static void main(String[] args){
		Comparator<Integer> comparator = new Comparator<Integer>(){
			public int compare(Integer i, Integer j){
				if (i < j) {
           				 return -1; // i is less than j
        			} else if (i > j) {
            				return 1; // i is greater than j
        			} else {
            				return 0; // i is equal to j
				}
				//return i.compareTo(j);
			}
		};

		//Integer[] arrays = {10,23,4,5,2,6,13,44,77,25,6,8,9,16};
		//Integer[] arrays = { 5, 4, 3, 2,1};
		Integer[] arrays = {1,2,3,4,5,4};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arrays));
		
		System.out.println(list);

		Collections.sort(list, comparator);
			
		System.out.println();

		System.out.println(list);

	}
}


