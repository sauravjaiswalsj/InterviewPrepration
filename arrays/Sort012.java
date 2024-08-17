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

public class Sort012
{
	public static void main(String[] args){
		
			int[] arr = {1,1,1,2,2,2,0,0,0,1,1,2,2};
			
			StressTest.display(arr);

			//int[] expected = brute(arr);

			//int[] actual = optimal(arr);
	}

	public static void optimized(int[] arr){
		int low = 0, mid = 0, high = arr.length -1;

		while(mid <= high){
			if(arr[mid] == 0 ){
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid] == 2){
				swap(arr,mid,high);;
				high--;
			}else{
				mid++;
			}
		}
	}
	private static void swap(int[] arr, int low, int high){
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}

	public static void brute(int[] arr)
    	{
        	int n = arr.length;
        	//Write your code here
        	int[] hash = new int[3];

        	for(int i = 0; i < arr.length; i++){
            		hash[arr[i]] += 1;
        	}

        	int j = 0;
        	// for(int i : hash){
        	//     System.out.println(i);
        	// }
        	for(int i = 0; i<hash[0]; i++){
        		arr[j] = 0;
           		j++;
        	}

        	for(int i = 0; i<hash[1]; i++){
            		arr[j] = 1;
            		j++;
        	}
       		for(int i = 0; i<hash[2]; i++){
            		arr[j] = 2;
            		j++;
        	}
    	}
}


		
