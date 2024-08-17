// 1985A
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CreatingWords {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0){
            String[] input = br.readLine().split(" ");

            String a = input[0];
            String b = input[1];

            String a1 = a.substring(0,1);
            String b1 = b.substring(0,1);

            System.out.println(b1+a.substring(1) + " " + a1+ b.substring(1));
        }
    }
}