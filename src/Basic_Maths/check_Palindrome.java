package Basic_Maths;

import java.util.Scanner;

public class check_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int flag= num;
		int rev_num = 0;
		while(num > 0) {
			int rem= num%10 ;
			num = num/10;
			rev_num = rev_num*10+rem;
		}
		
		if( flag == rev_num)
			System.out.println("Number is palindrome.");
		else
			System.out.println("Number is not palindrome.");
		sc.close();
	}

}
