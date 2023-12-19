package Recursion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
					
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int res = fact(num);
		System.out.println("Result :"+res);
		sc.close();
	}

	public static int fact(int num) {

		if( num == 1)
			return 1;
		return num* fact(num-1);
	}

}
