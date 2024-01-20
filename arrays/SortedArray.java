//StressTest Class Methods:
// getIntArray()
// getIntArray(min, max)
// getLongArray()
// matchIntArrays()
// matchLongArrays()
// debugIntArrays()
// display()

public class SortedArray {
	
	public static void main(String[] args){
		for(int i = 0; i < 5; i++){

			int[] arr = StressTest.getIntArray();
			
			StressTest.display(arr);
			//int expected = isSortedBrute(arr);
			int actual = isSorted(arr);
			System.out.println(actual);
			
		}
	}

	public static int isSorted(int[] arr){
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < arr[i - 1])
				return 0;
		}
		return 1;
	}
}


		
