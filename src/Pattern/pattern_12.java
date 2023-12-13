package Pattern;

import java.util.Scanner;

public class pattern_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows :");
		 int n= sc.nextInt();
		 for( int i=1;i<=n;i++) {
			 int count=1;
			 int j;
			 for( j=1;j<=i;j++) {
				 System.out.print(count);
				 count++;
			 }
			 for( j =0;j<2*(n-i);j++) {
				 System.out.print(" ");
			 }
			 count=i;
			 for( j=1;j<=i;j++) {
				 System.out.print(count);
				 count--;
			 }
			 System.out.println();
		 }
		 sc.close();
	}

}
