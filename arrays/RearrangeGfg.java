public class RearrangeGfg{
	public static void main(String[] args){
		for(int i = 0; i < 1000; i++){

			int[] arr = StressTest.getIntArray(1, 30);
			
			StressTest.display(arr);

			int[] expected = brute(arr);
			optimized(arr);

			System.out.println(StressTest.matchIntArrays(expected, arr));
		}
	}

	public static int[] brute(int[] arr){
		int n = arr.length;
		int[] brr = new int[n];
		for(int i = 0; i < n; i++){
			brr[i] = arr[arr[i]];
		}
		//upate arr in actual case
		return brr;
	}

	public static void optimized(int[] arr){
		int n = arr.length;
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i] + (arr[arr[i]]%n) * n;
		}

		for(int i = 0; i < n; i++){
			arr[i] = arr[i]/n;
		}
	}
}


		
