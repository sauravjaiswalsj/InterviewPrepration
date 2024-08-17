// StressTest Class Methods:
// Create an array of 100 elements with a maximum value of 50 and 40% probability of duplicates, start value can be null
// generateDuplicates(int maxSize, int maxValue, double duplicateProbability, Integer startValue)
// StressTest.generatehDuplicates(100, 50, 0.4);
// StressTest.getIntArray()
// StressTest.getIntArray(min, max)
// StressTest.getLongArray()
// Compare 2 int[] arrsys
// StressTest.matchIntArrays()
//
// Compare 2 long arrays
// StressTest.matchLongArrays(expected, actual)
//
// Compare integer arrays
// StressTest.debugIntArrays(expected, actual)
// StressTest.display()
//
// Compare 2 int values
// StressTest.compare(expected, actual);
// 
// Get Array from Array List<Integer<
// StressTest.getArray(list);

public class MovesZeroToEnd
{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){

			int[] arr = StressTest.getIntArray();
			StressTest.display(arr);

			int[] expected = brute(arr);
			

			int[] actual = optimal(arr);

			StressTest.debugIntArrays(expected,actual);
		}
	}

	public static int[] brute(int[] a){
		int n = a.length;
		int[] arr = new int[n];
        	int j = 0;
        	for(int i = 0; i < n; i++){
            		if(a[i] != 0){
                	arr[j] = a[i];
                	++j;
            		}    
        	}
        	for(;j<n;j++)
            	arr[j] = 0;
       	 	return arr;
	}

	public static int[] optimal(int[] arr){
		int j = 0;

		for (int i = 0; i < arr.length; i++){
			if (arr[i] != 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		return arr;
	}
}


		
