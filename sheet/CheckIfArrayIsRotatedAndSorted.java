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
// StressTest.getArray(ArrayList<Integer> list);

public class CheckIfArrayIsRotatedAndSorted
{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){

			int[] arr = StressTest.getIntArray();
			
			StressTest.display(arr);

			boolean expected = checkSimple(arr);

			boolean actual = check(arr);

			
			System.out.println(expected);
			System.out.println(actual);
		}
	}
	
	//O(n)
	public static boolean checkSimple(int[] arr){
		int count = 0;
		int n = arr.length;
		for (int i = 1; i < n; i++){
			if (arr[i-1] > arr[i])
				count++;
		}

		if (arr[n-1] > arr[0])
			count++;

		return count <= 1;
	}
	
	// Same but simple solution
	public static boolean check(int[] arr){
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++){
			if (arr[i] > arr[(i + 1)%n])
				count++;
		}

		return count <= 1;
	}
}


		
