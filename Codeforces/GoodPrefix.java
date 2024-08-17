import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// 1985 B
public class GoodPrefix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] array = br.readLine().split(" ");

            int[] arr = Arrays.stream(array).mapToInt(value -> Integer.parseInt(value)).toArray();

            System.out.println(goodPrefix(arr));
        }
    }
    private static int goodPrefix(int[] arr){
        if (arr.length == 1 && arr[0] == 0)
            return 1;
        else if (arr.length == 1 && arr[0] != 0)
            return 0;
        HashMap<Long, Integer> prefixSumFreq = new HashMap<>();
        long prefixSum = 0;
        int goodPrefixes = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0 || prefixSumFreq.containsKey(prefixSum)) {
                goodPrefixes++;
            }
            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0) + 1);
        }

        return goodPrefixes;

    }
}