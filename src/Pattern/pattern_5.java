package Pattern;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows :");
		 int n= sc.nextInt();
		 
		 for( int i=0;i<n;i++) {
			 for( int j=0;j<n-i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 sc.close();
	}

}
