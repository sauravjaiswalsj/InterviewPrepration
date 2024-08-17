package begineer.recursion;

import Template.StressTestTool;

public class SumOfDigits {
    public static void main(String[] args){
        int[] arr = StressTestTool.getIntArray(1,5000);
        //arr = new int[]{529,101,38};
        System.out.println("Test: ");
        StressTestTool.display(arr);
        for (int i : arr){
            int n = sumOfDigits(i);
            System.out.println("for #: "+ i +" sum: " + n);
        }
    }
    //O(log N)
    private static int sumOfDigits(int n){
        if (n == 0)
                return 0;

        int t =  n % 10 + sumOfDigits(n/10);
        if (t >= 10){
            return t % 10 + sumOfDigits(t/10);
        }
        return t;
    }
}
