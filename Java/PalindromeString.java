import java.util.*;

public class  PalindromeString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        
        String ans = sb.reverse().toString().equals(A) ? "Yes" : "No";
        System.out.println(ans);
        System.out.println('A' - 0);
	System.out.println('m' - 'a');
	}
}

