package Recursion;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int res = sumofN(num, 1);
		System.out.println("Result :"+res);
		sc.close();
	}
	
	public static int sumofN (int num , int count) {
		if(count == num)
			return count;
		
		return count+sumofN(num, count+1);
		
	}

}
