public class SelectionSort {
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
		for(int i = 0; i < arr.length - 1; i++){
			int min = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}


		
