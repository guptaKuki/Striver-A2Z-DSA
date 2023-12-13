package Pattern;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows :");
		 int n= sc.nextInt();
		 
		 for( int i=0;i<n;i++) {
			 int count =1 ;
			 for( int j=0;j<n-i; j++) {
				 System.out.print(count);
				 count++;
			 }
			 System.out.println();
		 }
		 sc.close();
	}

}
