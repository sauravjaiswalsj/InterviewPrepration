public class WaveSort{
	public static void main(String[] args){
		int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
		//int[] arr = {2, 4, 7, 8, 9, 10};
		//int[] arr = {10, 90, 49, 2, 1, 5, 23};
		
		System.out.println("Before Insertion");

		for (int i = 0; i < arr.length; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
		System.out.println();

		System.out.println("After insertion");

		sort(arr);

		for (int i = 0; i < arr.length; i++){
			System.out.printf(" %d ", arr[i]);
		}
		System.out.println();
	}
	public static void sort(int[] arr){
		for(int i = 0; i <= arr.length - 1; i+=2){
			if(i>0 && arr[i-1] > arr[i])
				swap(arr,i,i-1);
			display(arr , i);
			if(i<arr.length-1 && arr[i+1] > arr[i])
				swap(arr, i, i+1);
			display(arr , i);
			System.out.println(i);
		}
	}
	public static void swap(int[] arr, int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void display(int[] arr, int k){
		System.out.println("Loop display at index: " + k);
		for (int i = 0; i < arr.length; i++){
			System.out.printf(" %d ", arr[i]);
		}
		System.out.println();
	}
}
