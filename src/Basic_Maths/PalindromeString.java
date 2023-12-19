package Basic_Maths;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		int start = 0, end = str.length()-1;
	    
		for( int i=0;i<=str.length()/2;i++) {
			
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
			System.out.println("Not a Palindrome");
			return;
			}
		}
		System.out.println("Palindrome");
		sc.close();
	}

}
