package Pattern;

import java.util.Scanner;

public class pattern_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows :");
		 int n= sc.nextInt();
		 for( int i=0;i<n;i++) {
			 char c='A' ;
			 for( int j=0;j<=i;j++) {
				 System.out.print(c+" ");
				 c++;
			 }
			 System.out.println();
		 }
		 sc.close();
	}

}
