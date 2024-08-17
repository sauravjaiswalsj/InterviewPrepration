public class SortingRecursion {
    public static void main(String[] args) {
        //int[] arr = {2, 3, 7, 6, 4, 5, 9};
        int arr[] = {1,5,0,2};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sort(arr, arr.length);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr, int n){
        if (n == 0)
            return;

        int temp = arr[n-1];
        sort(arr, n-1);
        insert(arr, n-1, temp);
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