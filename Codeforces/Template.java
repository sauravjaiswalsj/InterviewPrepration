import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Template {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nk = br.readLine();
        String[] array = nk.split("\\+");

        int[] arr = Arrays.stream(array).mapToInt(value -> Integer.parseInt(value)).toArray();
        Arrays.sort(arr);
        String str = "";
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length -1){
                str += Integer.toString(arr[i]);
                break;
            }
            else {
                str += Integer.toString(arr[i]) + "+";
            }
        }
        System.out.println(str);
    }
}