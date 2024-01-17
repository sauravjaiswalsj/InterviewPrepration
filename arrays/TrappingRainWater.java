public class TrappingRainWater{
	public static void main(String[] args){
		long[] arr = {8,1,8,2,4};

		System.out.println(getTrappedWaterFast(arr,5));

        for(int i = 0; i < 50; i ++){
            long[] array = StressTest.getLongArray();
            int n = array.length;
            if(getTrappedWater(array, n) == getTrappedWaterFast(array, n)){
                System.out.println("passed");
            }
            else{
                System.out.println("failed");
            }
        }
	}
	//O(n^2)
	public static long getTrappedWater(long []arr, int n) {
        // Write your code here.
        long max = Long.MIN_VALUE;
        long sum = 0;


        for(int i = 0; i < n-1; i++){
            max = arr[i] > max ? arr[i] : max;
            long maxRight = arr[i];
            for(int j = i + 1; j < n; j++){
                maxRight = arr[j] > maxRight ? arr[j] : maxRight;
            }
                sum += Math.min(max,maxRight) - arr[i];
        }
        return sum;
    }
    //O(n)

    public static long getTrappedWaterFast(long[] arr, int n){
	    long[] left = new long[n];
	    long[] right = new long[n];

	    long maxLeft = Long.MIN_VALUE;
	    for(int i = 0; i < n; i++){
		    maxLeft = Math.max(maxLeft, arr[i]);
		    left[i] = maxLeft;
	    }

	    long maxRight = Long.MIN_VALUE;

	    for(int i = n-1;  i >=0; i--){
		    maxRight = Math.max(maxRight, arr[i]);
		    right[i] = maxRight;
	    }

	    long sum = 0;

	    for(int i = 0; i<n; i++){
		    sum += Math.min(left[i], right[i]) - arr[i];
	    }
	    return sum;
    }
}
