import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 1985 B
public class MaximumMultipleSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(getMaxMultiple(n));
        }
    }

    private static int getMaxMultiple(int n){
        long max = 0;
        long sum = 0;
        int valueOfX = 0;
        for (int x = 2; x <= n; x++){
            long k = Math.abs(n/x);
            sum = x * (k * (k+1))/2;

            if (sum >= max){
                max = sum;
                valueOfX = x;
            }
        }
        return valueOfX;
    }
}