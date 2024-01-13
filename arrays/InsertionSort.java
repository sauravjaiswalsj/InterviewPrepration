public class InsertionSort {
	public static void main(String[] args){
		int[] arr = {100,20,50,30,10,6,1,5};

		System.out.println("Before Insertion");

		for (int i = 0; i < arr.length; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
		System.out.println();

		System.out.println("After insertion");
		
		sort(arr);
		
		for (int i = 0; i < arr.length; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
		System.out.println();
	}

	public static void sort(int[] arr){
		for (int i = 1; i < arr.length; i++){
			int val = arr[i];
			int j = i-1;

			while (j >= 0 && arr[j] > val){
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = val;
		}
	}
}


		
