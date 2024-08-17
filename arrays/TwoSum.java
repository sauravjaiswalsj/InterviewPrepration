// StressTest Class Methods:
// Create an array of 100 elements with a maximum value of 50 and 40% probability of duplicates, start value can be null
// generateDuplicates(int maxSize, int maxValue, double duplicateProbability, Integer startValue)
// StressTest.generatehDuplicates(100, 50, 0.4);
// StressTest.getIntArray()
// StressTest.getIntArray(min, max)
// StressTest.getLongArray()
// StressTest.matchIntArrays()
// StressTest.matchLongArrays()
// StressTest.debugIntArrays()
// StressTest.display()
// StressTest.compare(expected, actual);
import java.util.*;
import javafx.util.Pair;
public class TwoSum
{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){

			int[] arr = StressTest.getIntArray();
			
			StressTest.display(arr);

			//int[] expected = brute(arr);

			//int[] actual = optimal(arr);
		}
	}

	public static ArrayList<Pair<Integer, Integer>> twoSumN2(ArrayList<Integer> arr, int target, int n) {
		// Write your code here.
		//ArrayList<Pair<Integer, Integer>> list = new ArrayList<Pair<>>();
		ArrayList<Pair<Integer, Integer>> list = new ArrayList<Pair<Integer, Integer>>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				int sum = arr.get(i) + arr.get(j);
				if(sum == target){
					if((!map.containsKey(i) && !map.containsValue(j)) && (!map.containsKey(j) && !map.containsValue(i))){
						map.put(i,j);
						list.add(new Pair(arr.get(i),arr.get(j)));
						break;
					}
				}
			}
		}
		// for(Map.Entry<Integer, Integer> entry: map.entrySet()){
		// 	System.out.println(entry.getKey() + " " + entry.getValue());
		// }

		if(list.size() == 0)
			list.add(new Pair(-1,-1));

		return list;
	}
	public static ArrayList<Pair<Integer, Integer>> optimal(ArrayList<Integer> arr, int target, int n) {
		// Write your code here.
		ArrayList<Pair<Integer, Integer>> list = new ArrayList<Pair<Integer, Integer>>();
		Collections.sort(arr);

		int low = 0; 
		int high = n-1;

		while(low < high){
			int sum = arr.get(low) + arr.get(high);
			if(sum < target)
				++low;
			else if(sum > target)
				--high;
			else{
				list.add(new Pair(arr.get(low),arr.get(high)));
				low++;
				high--;
			}
		}

		if(list.size() == 0)
			list.add(new Pair(-1,-1));

		return list;
	}

	public static ArrayList<Pair<Integer, Integer>> twoSumN(ArrayList<Integer> arr, int target, int n) {
		// Write your code here.
		ArrayList<Pair<Integer, Integer>> list = new ArrayList<Pair<Integer, Integer>>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < n; i++){
			int diff = target - arr.get(i);
			if(map.containsValue(diff)){
				int index = -1;
				for(Map.Entry<Integer,Integer> entry: map.entrySet()){
					if(diff == entry.getValue()){
						index = entry.getKey();
						break;
					}
				}
				list.add(new Pair(arr.get(index), arr.get(i)));
				map.remove(index, diff);
			}else{
				map.put(i,arr.get(i));
			}
		}

		if(list.size() == 0)
			list.add(new Pair(-1,-1));

		return list;
	}
}


		
