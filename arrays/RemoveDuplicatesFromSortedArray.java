// StressTest Class Methods:
// Create an array of 100 elements with a maximum value of 50 and 40% probability of duplicates
// StressTest.generatehDuplicates(100, 50, 0.4);
// StressTest.getIntArray()
// StressTest.getIntArray(min, max)
// StressTest.getLongArray()
// StressTest.matchIntArrays()
// StressTest.matchLongArrays()
// StressTest.debugIntArrays()
// StressTest.display()

/*
 *
 * You are given a sorted integer array 'arr' of size 'n'.



You need to remove the duplicates from the array such that each element appears only once.



Return the length of this new array.



Note:
Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory.


For example:
'n' = 5, 'arr' = [1 2 2 2 3].
The new array will be [1 2 3].
So our answer is 3.

*/
import java.util.HashSet;
import java.util.Arrays;
public class RemoveDuplicatesFromSortedArray
{
	public static void main(String[] args){
		for(int i = 0; i < 2; i++){

			int[] arr = StressTest.generateDuplicates(100, 50, 0.4,3);;
			//int[] arr = {1,1,2,2,3,3};
			Arrays.sort(arr);
			StressTest.display(arr);

			int expected = brute(arr);
			int act = better(arr);
			//int[] actual = optimal(arr);
			StressTest.compareDebug(expected,act);	
		}
	}

	public static int brute(int[] arr){
		HashSet<Integer> set = new HashSet<>();

        	for(int i = 0; i < arr.length; i++){
            		set.add(arr[i]);
        	}

        	return set.size();
	}

	public static int better(int[] arr){
		int maxValue = Integer.MIN_VALUE;
		int n = arr.length;
		for(int i = 0; i < arr.length; i++)
			maxValue = Math.max(maxValue,arr[i]);

		int[] hash = new int[maxValue+1];

		for(int i = 0; i < n; i++){
			if(hash[arr[i]] == 0)
				hash[arr[i]] = 1;
		}
		int count = 0;

		for(int i = 1; i < hash.length; i++){
			if(hash[i] == 1)
				++count;
		}
		//StressTest.display(hash);
		return count;
	}
}


		
