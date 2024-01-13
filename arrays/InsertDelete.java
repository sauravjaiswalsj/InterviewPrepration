public class InsertDelete {
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i = 0; i < 7; i++){
			arr[i] = (i+1) *10;
		}

		int size = 7; 

		System.out.println("Before Insertion");

		for(int i = 0; i < size; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
		System.out.println();
		
		System.out.println("After insertion");
		
		size = insertElement(arr, size, 4, 45);

		for(int i = 0; i < size; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
		System.out.println();
		System.out.println("After Deletion");

		deleteElement(arr,size, 4, 45);
		
		for(int i = 0; i < size; i++){
			System.out.printf("index %d : %d ", i, arr[i]);
		}
	}

	public static int insertElement(int[] arr, int ne, int pos, int item ){
		if(arr.length == ne){
			return ne;
		}

		for(int i = ne - 1; i >= pos; i--){
			arr[i+1] = arr[i];
		}

		arr[pos] = item;
		return ++ne;

	}

	public static int deleteElement(int[] arr, int ne, int pos, int item ){
		if(ne == 0)
			return ne;

		for(int i = pos; i < ne; i++){
			arr[i] = arr[i+1];
		}
		return --ne;
	}
}


		
