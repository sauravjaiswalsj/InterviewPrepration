package begineer.recursion;
import Template.StressTestTool;

public class nSum {
    public static void main(String[] args){
        int[] arr = StressTestTool.getIntArray(1,40);
        System.out.println("Test: ");
        StressTestTool.display(arr);
        for (int i : arr){
            int n = NnumbersSum(i);
            System.out.println("for #: "+ i +" sum: " + n);
        }
    }
    //Time Complexity:The time complexity is O(n) due to the recursive calls that decrease n by 1 each time until it reaches 1.
    //Space Complexity:The space complexity is O(n) due to the call stack used by the recursive function calls.
    public static int NnumbersSum(int n) {
        //your code goes here
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return n + NnumbersSum(n-1);
    }
}
