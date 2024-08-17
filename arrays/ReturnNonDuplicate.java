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

/*
 *
 * You are given a sorted array ‘arr’ of ‘n’ numbers such that every number occurred twice in the array except one, which appears only once.



Return the number that appears once.



Example:
Input: 'arr' = [1,1,2,2,4,5,5]

Output: 4

 */
public class ReturnNonDuplicate
{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){

			int[] arr = StressTest.getIntArray();
			
			StressTest.display(arr);

			//int[] expected = brute(arr);

			//int[] actual = optimal(arr);
		}
	}

	public static int singleNonDuplicate(ArrayList<Integer> arr)
    	{
        	//    Write your code here.
        	// 1 ^ 1 = 0
        	// 1 ^ 0 = 1

        	int xor = 0;

        	for(int i : arr){
            		xor ^= i;
        	}
        	return xor;
    	}
}


		
