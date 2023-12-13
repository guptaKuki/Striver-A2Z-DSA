package Pattern;

import java.util.Scanner;

public class pattern_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows :");
		 int n= sc.nextInt();

		 for ( int i=0 ;i<n;i++) {
			  int j;
			 for( j=0; j<= n-i-1;j++) 
				 System.out.print(" ");
			 for( j=0;j<2*i+1;j++)
				System.out.print("*");
			 for( j =0;j<n-i-1;j++)
				 System.out.print(" ");
			 System.out.println();	 
		 }
		 sc.close();
	}

}
