import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class ArrayInput{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nk = br.readLine();
        String[] test = nk.split(" ");
        int n = Integer.parseInt(test[0]);
        int k = Integer.parseInt(test[1]);

        String[] array = br.readLine().split(" ");

        int[] arr = Arrays.stream(array).mapToInt(value -> Integer.parseInt(value)).toArray();

        Arrays.stream(arr).forEach(x -> System.out.println(x) );

    }
}