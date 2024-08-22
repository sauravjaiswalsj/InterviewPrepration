package begineer.Strings;
import Template.StressTestTool;
public class LargestOddNumberInString {
    public static void main(String[] args) {
        for (int j = 0; j < 11; j++) {
            long[] arr = StressTestTool.getLongArray();

            for (int i = 0; i < arr.length; i++) {
                String s = String.valueOf(arr[i]);

                if (testCode(s).equals(largeOddNum(s))) {
                    System.out.println(StressTestTool.TextColor.GREEN.colorize("Pass"));
                } else {
                    System.out.println(StressTestTool.TextColor.RESET);
                    System.out.println(StressTestTool.TextColor.RED.colorize("Failed"));
                    System.out.println(s);
                }
            }
        }
    }

    public static String largeOddNum(String s) {
        //your code goes here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++){
            String str = "";

            for (int j = i; j < s.length(); j++){
                str += s.charAt(j);
                int val = Integer.parseInt(str);
                if ((val & 1) == 1){
                    max = Math.max(val, max);
                }
            }
        }

        return max == Integer.MIN_VALUE ? "" : String.valueOf(max);
    }

    public static String testCode(String s) {
        int ind = -1;

        // Iterate through the string from the end to beginning
        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            // Break if an odd digit is found
            if ((s.charAt(i) - '0') % 2 == 1) {
                ind = i;
                break;
            }
        }

        // Skipping any leading zeroes
        i = 0;
        while(i <= ind && s.charAt(i) == '0') i++;

        // Return the largest odd number substring
        return s.substring(i, ind - i + 1);
    }
}
