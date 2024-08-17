import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		System.out.println(isPalindrome(n));
	}

	public static boolean isPalindrome(long n){

		long temp = n;
		long sum = 0;
		while (temp != 0){
			long rem = temp % 10;
			sum = (sum * 10) + rem;

			temp/= 10;
		}
		if (sum == n)
			return true;
		return false;
	}


	public static boolean isAmstrong(long n){
		int d = (int)(Math.log10(n)+1);
		long temp = n;
		long sum = 0;
		while (temp != 0){
			long rem = temp % 10;

			sum = sum + (long)Math.pow(rem,d);

			temp /= 10;
		}

		if (sum == n)
			return true;
		return false;
	}
}

