public class BubbleSort {
	public static void main(String[] args){
		int[] arr = {100,20,50,30,10,6,1,5};

		System.out.println("Before sorting");

		for (int i = 0; i < arr.length; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
		System.out.println();

		System.out.println("After sorting");
		
		sort(arr);
		
		for (int i = 0; i < arr.length; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
		System.out.println();
	}

	public static void sort (int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i -1; j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}


		
