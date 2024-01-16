public class MaximumSum {
	
	public static void main(String[] args){
		String red = "\u001B[31m";
		for(int i = 0; i < 200; i++){

			int[] arr = StressTest.getIntArray();
			
			StressTest.display(arr);

			int expected = brute(arr);
			int actual = kadanes(arr);
		
			if( expected == actual){
				System.out.println("Passed");
			}
			else{
				System.out.println(red + "Failed");
			}
		}
	}

	public static int brute (int[] arr){
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++){
			int sum = 0;
			for(int j = i; j < arr.length; j++){
				sum += arr[j];
				if(sum > max)
					max = sum;
			}
		}
		return max;
	}

	public static int kadanes(int[] arr){
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;

		for(int i = 0; i < arr.length; i++){
			currSum += arr[i];
			maxSum = Math.max(currSum,maxSum);
			currSum = currSum < 0 ? 0 : currSum;
		}
		return maxSum;
	}
}


		
