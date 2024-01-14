import java.util.Arrays;

public class MaxNsMax{
	public static void main(String[] args){
		for(int i = 0; i < 100; i++){
			int[] arr = StressTest.getIntArray();
			int[] expected = brute(arr);
			StressTest.display(arr);

			int[] actual = optimal(arr);
			
			if(expected.length == 1 && (expected[0] == actual[0] && expected[1] == actual[1]))
				System.out.println("Passed");
			
			else if(expected.length == 2 && (expected[0] == actual[0] && expected[1] == actual[1]))
                                  System.out.println("Passed");
			else 
				System.out.println("Failed");
		}
	}
	
	//Brute
	public static int[] brute(int[] arr){
		Arrays.sort(arr);
		int n = arr.length;
		if ( n == 1) 
			return new int[]{arr[n-1],-1};
		return new int[]{arr[n-1], arr[n-2]};
	}
	
	public static int[] optimal(int[] arr){
		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				sMax = max;
				max = arr[i];
			}

			if(arr[i] > sMax && arr[i] !=max){
				sMax = arr[i];
			}
		}
		if(sMax == Integer.MIN_VALUE)
			sMax = -1;
		return new int[]{max, sMax};
	}
}
