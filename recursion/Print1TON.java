import java.util.*;

public class Print1TON{
	public static void main(String[] args){
		print(10);
	}

	public static void print(int n){
		if (n == 1){
			System.out.println(n);
			return;
		}
		//System.out.println(n);

		print(n-1);

		System.out.println(n);
	}
		
}

