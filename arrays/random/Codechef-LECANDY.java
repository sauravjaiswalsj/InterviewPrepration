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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codechef-LECANDY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- >0){
		    String[] num = br.readLine().split(" ");
			int n = Integer.parseInt(num[0]);
			int c = Integer.parseInt(num[1]);
			int[] arr = new int[n];
			String[] array = br.readLine().split(" ");
			int sum = 0;
			for(int i = 0; i < n; i++){
			    arr[i] = Integer.parseInt(array[i]);
			    
			    sum += arr[i];
			}
			
			System.out.println(isDistributionPossible(sum,c));
		}
	}
	
	private static String isDistributionPossible(int sum, int c){
	    return c >= sum ? "Yes" : "No";
	}
}


		
