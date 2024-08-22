package begineer.Strings;
import java.util.Arrays;
import Template.StressTestTool;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = StressTestTool.generateStringLists(4, 1, 10, String[].class);
        arr = new String[]{"lady" , "lazy"};
        String str = longestCommonPrefix(arr);
        Arrays.stream(arr).forEach(x -> System.out.println(x));

        StressTestTool.TextColor.CYAN.print(str);
    }
    public static String longestCommonPrefix(String[] str) {
        // Horizontal way
        if (str.length == 0)
            return "";
        if (str.length == 1)
            return str[0];

        String prefix = str[0];
        for (int i = 1; i < str.length; i++){
            while (str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() -1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
