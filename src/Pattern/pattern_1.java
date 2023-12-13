package Pattern;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int nrow= sc.nextInt();
		
		for(int i=0;i<nrow;i++) {
			for(int j=0;j<nrow;j++)
				System.out.print("*");
			System.out.println();
		}
		sc.close();
	}

}
