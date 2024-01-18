public class  EquilibriumPoint{
	
	public static void main(String[] args){
		for(int i = 0; i < 50; i++){

			int[] arr = StressTest.getIntArray();
			
			StressTest.display(arr);

			int optimal = optimized(arr);
			int actual = getPoint(arr);

			if(optimal == actual){
				System.out.println("Passed");
			}else{
				System.out.println("Failed.");
			}
		}
	}
	public static int getPoint(int[] arr){
		int n = arr.length;
		if(n == 1)
			return 1;
		int low = 0, high = n-1;

		while(low <= high){
			int lSum = 0, rSum = 0;

			int mid = low + (high - low)/2;

			for(int i = 0; i < mid; i++){
				lSum += arr[i];
			}

			for(int i = mid + 1; i < n; i++){
				rSum += arr[i];
			}

			if(lSum == rSum){
				return mid +1;
			}else if(lSum < rSum){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		return -1;
	}

	private static int optimized(int[] arr){
		int total = 0;
		int diff = 0;

		for(int i = 0; i < arr.length; i++)
			total += arr[i];

		int currSum = 0;
		for(int i =0; i < arr.length; i++){
			diff = total - currSum - arr[i];
			if(diff == currSum)
				return i + 1;
			currSum += arr[i];
		}
		return -1;
	}
}


		
