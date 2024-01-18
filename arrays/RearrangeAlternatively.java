import java.util.Arrays;
public class RearrangeAlternatively {
	
	public static void main(String[] args){
		for(int i = 0; i < 50; i++){

			int[] arr = StressTest.getIntArray();
			Arrays.sort(arr);	
			StressTest.display(arr);

			int[] expected = brute(arr);
			optimized(arr);
			System.out.println(StressTest.matchIntArrays(expected, arr));
		}
	}
	//O(n) + O(n) space
	public static int[] brute(int[] arr){
		int n = arr.length;
        if(n==1)
            return arr;
        int[] temp = new int[n];
        int low = 0; 
        int high = n-1;
        int i = 0;
        while(low <= high && i < n){
            temp[i] = arr[high];
            ++i;
            --high;
            
            if(i < n){
                temp[i] = arr[low];
                ++i;
                ++low;
            }
        }
        return temp;
	}

	//O(n) + O(1) space
	public static void  optimized(int[] arr){
		int n = arr.length;
		int low = 0, high = n -1;
		int maxE = arr[high] + 1;

		// arr[i] = arr[i] + arr[low/high] % maxE * maxE;
		
		for(int i = 0; i < n; i++){
			if(low <= high){
				if((i & 1) == 0){ // even : set highest Value
					arr[i] = arr[i] + arr[high]%maxE * maxE;
					high--;
				}
				else{ // odd : set Lowest Value Possible
				      arr[i] = arr[i] + arr[low]%maxE * maxE;
				      low++;
				}
			}
		}
		// set the value back to normal
		for(int i = 0; i < n; i++){
			arr[i] = arr[i]/maxE;
		}
	}
}


		
