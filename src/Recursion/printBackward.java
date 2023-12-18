package Recursion;

import java.util.Scanner;

public class printBackward {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int count=1;
		printNto1(num,count);
		sc.close();
	}

	public static void printNto1(int num, int count) {

		if(count > num)
			return;
		
		printNto1(num, count+1);
		System.out.print(count+" ");
		
	}

}
