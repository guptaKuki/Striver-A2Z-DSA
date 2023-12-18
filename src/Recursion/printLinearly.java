package Recursion;

import java.util.Scanner;

public class printLinearly {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int count=1;
		print1toN(num,count);
		System.out.println();
		print1toNBacktracking(num, num);
		sc.close();
	}

	public static void print1toN(int num, int count) {

		if(count > num)
			return;
		
		System.out.print(count+" ");
		count++;
		print1toN(num, count);
	}
	
	public static  void print1toNBacktracking(int num,int count) {
		if(count < 1)
			return;
		
		print1toNBacktracking(num, count-1);
		System.out.print(count+" ");
	}

}
