import java.util.*;

public class sumOfOdd{
	public static void main(String[] args){
		System.out.println(sum(5,1));
	}

	public static int sum(int n, int i){
		if (n == 0)
			return 0;
		System.out.println(i);

		return i + sum(n-1, i+2);
	}
}

