package Basic_Maths;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int rev_num = 0;
		while(num > 0) {
			int rem= num%10 ;
			num = num/10;
			rev_num = rev_num*10+rem;
		}
		System.out.println("Reverse Number :"+rev_num);
		sc.close();
	}

}
