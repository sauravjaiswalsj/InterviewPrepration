import java.util.*;

public class PrintName{
	public static void main(String[] args){
		printName(5);
	}

	public static void printName(int n){
		if (n==0)
			return ;
		System.out.println("Saurav");
		printName(--n);
	}
}

