import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PrimeVisit{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		while (test-- > 0){
			String[] ar = br.readLine().split(" ");

			int a = Integer.parseInt(ar[0]);
			int b = Integer.parseInt(ar[1]);
			
			int count = 0;
			for (int i = a; i <= b; i++){
				if (isPrime(i))
					++count;
			}
			System.out.println(count);
		}
	}

	private static boolean isPrime(int n){
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n%2 == 0 || n%3 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(n); i++)
			if (i % n == 0)
				return false;

		return true;
	}
}

		





