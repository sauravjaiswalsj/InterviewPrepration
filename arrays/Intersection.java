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

import java.util.ArrayList;
public class Intersection
{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){

			int[] arr = StressTest.getIntArray();
			int[] brr = StressTest.getIntArray();

			StressTest.display(arr);
			StressTest.display(brr);

			int[] expected = brute(arr, brr);

			int[] actual = intersectionArrays(arr, brr);

			System.out.println(StressTest.matchIntArrays(expected, actual));
		}
	}
	// 1 2 2 2 3 4
	// 2 2 3 3
	// OP: 2 2 3
	public static int[] brute(int[] arr, int[] brr){
		ArrayList<Integer> list = new ArrayList<>();
		int[] visited = new int[brr.length];

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < brr.length; j++){
				if(arr[i] == brr[j] && visited[j] != 1){
					list.add(arr[i]);
					visited[j] = 1;
					break;
				}
			}
		}
		return StressTest.getArray(list);
		
	}
	public static int[] intersectionArrays(int[] arr, int[] brr){
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0, j = 0; 
		while(i < arr.length && j < brr.length){
			if(arr[i] < brr[j])
				i++;
			else if(arr[i] > brr[j])
				j++;
			else{
				list.add(arr[i]);
				i++;
				j++;
			}
		}
		return StressTest.getArray(list);
	}
}


		
