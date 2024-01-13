public class BinarySearch {
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50,60,70};

		int a = 10;
		System.out.println(getElementIndex(arr, a));
		int b = 70;
		System.out.println(getElementIndex(arr, b));
		int c  = 50;
		System.out.println(getElementIndex(arr, c));

	}

	public static int getElementIndex(int[] arr, int item){
		int low = 0, high = arr.length;
		int mid = 0;
		while(low <= high){
			mid = low + (high - low)/2;

			if (arr[mid] > item)
				high = mid - 1;
			else if (arr[mid] < item)
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}
}


		
