package Recursion;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the index value:");
		int num = sc.nextInt();
		int res = fibo(num);
		System.out.println("Result :"+res);
		sc.close();
	}
	
	public static int fibo(int num) {
		if( num ==0 || num ==1)
			return num;
		
		return fibo(num-1) + fibo(num-2);
		
	}
}
