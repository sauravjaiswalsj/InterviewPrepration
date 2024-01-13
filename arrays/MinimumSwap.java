/*
 * https://leetcode.com/problemset/?search=minimum-swaps-to-group-all-1s-together&page=1
 *
 * Given a binary array data, return the minimum number of swaps required to group all 1’s present in the array together in
any place in the array.



Example 1:


Input: data = [1,0,1,0,1]
Output: 1
Explanation: There are 3 ways to group all 1's together:[1,1,1,0,0] using 1 swap.[0,1,1,1,0] using 2 swaps.[0,0,1,1,1] using 1 swap.The minimum is 1.
Example 2:


Input: data = [0,0,0,1,0]
Output: 0
Explanation: Since there is only one 1 in the array, no swaps are needed.
Example 3:


Input: data = [1,0,1,0,1,0,0,1,1,0,1]
Output: 3
Explanation: One possible solution that uses 3 swaps is [0,0,0,0,0,1,1,1,1,1,1].



Constraints:

1 <= data.length <= 105
data[i] is either 0 or 1.
 *
 */


public class MinimumSwap {
	public static void main(String[] args){
		int[] arr = {1,0,1,0,1};
		
		System.out.println("Before Insertion");

		for (int i = 0; i < arr.length; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
		System.out.println();

		System.out.println("After insertion");

		int count = minimum(arr);

		System.out.println(count);

	}

	public static int minimum(int[] arr){
		int count = 0;
		for(int i = 0; i < arr.length-1; i++){
			int min = i;
			for(int j = i+1; j < arr.length-1; j++){
				if(arr[j] < arr[min])
					min = j;
			}
			count = count +  swap(arr, min , i);
		}
		return count;
	}

	public static int swap(int[] arr, int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return 1;
	}

	public static void display(int[] arr, int k){
		System.out.println("Loop display at index: " + k);
		for (int i = 0; i < arr.length; i++){
			System.out.printf(" %d ", arr[i]);
		}
		System.out.println();
	}
}


		
