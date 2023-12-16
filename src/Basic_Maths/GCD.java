package Basic_Maths;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2 :");
		int num2=sc.nextInt();
		
		for( int i= Math.min(num1, num2);i>=1;i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println("GCD of the  both number is :"+i);
				break;
			}
		}
		gcdMethod(num1, num2);
		sc.close();
	}
	
	public static void gcdMethod(int a , int b) {
		while(a > 0 && b > 0) {
			if( a > b)
				a= a%b;
			else
				b=b%a;
		}
		if(a == 0)
			System.out.println("GCD : "+b);
		else
			System.out.println("GCD :"+a);
	}

}
