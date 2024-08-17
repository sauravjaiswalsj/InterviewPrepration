import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.trim();
        if (input.length() == 0)
            return;

        System.out.println(input.substring(0,1).toUpperCase() + input.substring(1));
    }
}