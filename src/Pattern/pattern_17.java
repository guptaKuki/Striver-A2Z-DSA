package Pattern;

import java.util.Scanner;

public class pattern_17 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows :");
		 int n= sc.nextInt();
		 
		 int j;
		 for( int i=0;i<n;i++) {
			 char c='A';
			 for( j=0;j<n-i;j++) 
				 System.out.print(" ");

			for( j =0;j<2*i+1;j++) {
				System.out.print(c);
				if(j<i)
					c++;
				else
					c--;
			}
			for( j=0;j<n-i;j++) 
				 System.out.print(" ");
			System.out.println();
		 }
		 sc.close();
	}

}
