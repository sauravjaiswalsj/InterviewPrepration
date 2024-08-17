import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());

		while (test-- > 0){
			String str = br.readLine();

			HashMap<Character, Integer> seen = new HashMap<>();

			for (int i = 0; i < str.length(); i++){
				char val = str.charAt(i);
				if (seen.containsKey(val)){
					seen.put(val,seen.get(val) + 1);
				}
				else{
					seen.put(val, 1);
				}
			}

			int max = 0; 
			char c = 'A';

			for (Map.Entry<Character,Integer> entry : seen.entrySet()){
				//System.out.println(max);
				if (entry.getValue() > max){
					max = entry.getValue();
					c = entry.getKey();
				}
			}

			System.out.println(c);
		}
	}
}
