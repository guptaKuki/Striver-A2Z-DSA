package Basic_Maths;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int dup= num;
		int count=0;
		while(num > 0) {
			count++;
			num=num/10;
		}
		num=dup;
		int result = 0;
		while(num > 0) {
			int rem= num%10 ;
			num = num/10;
			result= result + (int)Math.pow(rem, count);
		}
		
		if( dup == result)
			System.out.println("Number is Armstrong.");
		else
			System.out.println("Number is not Armstrong.");
		sc.close();
	}

}
