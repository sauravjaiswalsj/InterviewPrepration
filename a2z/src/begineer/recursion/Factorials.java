package begineer.recursion;

import Template.StressTestTool;

public class Factorials {
    public static void main(String[] args){
        int[] arr = StressTestTool.getIntArray(1,30);
        System.out.println("Test: ");
        StressTestTool.display(arr);
        for (int i : arr){
            long n = factorial(i);
            System.out.println("for #: "+ i +" sum: " + n);
        }
    }
    //O(n)
    //Space Complexity:The space complexity is O(n) because of the recursive call stack that can go up to n calls deep.
    public static long factorial(int n) {
        //your code goes here
        if (n == 1 || n == 0)
            return 1;

        return n* factorial(n-1);
    }
}
