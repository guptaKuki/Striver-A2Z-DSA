package Recursion;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc .next();
		
		boolean flag= palindrome(str,0);
		if(flag == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

	public static boolean palindrome(String str , int i) {
		if(i >= str.length()/2)
			return true;
		
		if(str.charAt(i) != str.charAt(str.length()-i-1))
			return false;
		
		return palindrome(str,i+1);
	}
}
