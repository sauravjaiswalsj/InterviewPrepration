import java.util.*;

public class sort{
	public static void main(String[] args){
		//int[] arr = {2,3,7,6,4,5,9};
		int[] arr = {1,5,0,2};
		for (int i : arr){
			System.out.print(i + " ");
		}
		sort(arr,arr.length-1);
		System.out.println();
		for (int i : arr){
			System.out.print(i+ " ");
		}
		System.out.println();
	}

	public static void sortRec(int[] arr, int n){
		if(n == 0)
			return;

		sortRec(arr,n-1);
		//if (arr[n-1] > arr[n]){
		//	int temp = arr[n-1];
		//	arr[n-1] = arr[n];
		//	arr[n] = temp;
		//}
		for (int i = n; i > 0; i--){
			if (arr[i-1] > arr[i]){
			int temp = arr[i-1];
			arr[i-1] = arr[i];
			arr[i] = temp;
			}
		}

	}
	//complete recursion
	public static void sort(int[] arr, int n){
        if(n == 0)
			return;
        int temp = arr[n];
		sort(arr, n-1);

        insert(arr, n, temp);
    }

    public static void insert(int[] arr, int n, int val){
        if (n == 0 || arr[n-1] <= val){
            arr[n] = val;
            return;
        }
        int temp = arr[n-1];
        insert(arr, n-1, val);
        arr[n] = temp;
    }

}

