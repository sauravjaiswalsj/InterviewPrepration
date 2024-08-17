import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class DFunc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            String[] input = br.readLine().split(" ");

            int l = Integer.parseInt(input[0]);
            int r = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);

            long count = dFunction(l, r, k);
            System.out.println(count);
        }
    }
    private static long dFunction(int l, int r, int k){
        long count = 0;
        long mod =  (long)Math.pow(10,9)+7;

        BigInteger lowerBound = BigInteger.TEN.pow(l);
        BigInteger upperBound = BigInteger.TEN.pow(r);
        BigInteger bigK = BigInteger.valueOf(k);

        BigInteger n = lowerBound;
        while (n.compareTo(upperBound) < 0){
            long dOfKN = sumOfDigit(bigK.multiply(n).toString());
            long val = sumOfDigit(n.toString());
            BigInteger mul = new BigInteger(Long.toString(val));
            String kOfDn = bigK.multiply(mul).toString();
            if ( kOfDn.equals(String.valueOf(dOfKN))) {
                count += 1;
                count = count % mod;
            }
            n = n.add(BigInteger.ONE);
        }
        return count;
    }

    private static long sumOfDigit(String n){
        long sum = Long.parseLong(String.valueOf(n.charAt(0)));
        return sum;
    }
}