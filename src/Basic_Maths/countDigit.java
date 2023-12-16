package Basic_Maths;

import java.util.Scanner;

public class countDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		int count=0;
		while( num > 0) {
			int ld = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println("Count :"+count);
		sc.close();
	}

}
