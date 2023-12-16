package Basic_Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class printAllDivisors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		for( int i=1;i<=num/2 ;i++) {
			if(num % i == 0)
				System.out.print(i+" ");
		}
		System.out.print(num);
		System.out.println();
		List<Integer>li=printDivisor(num);
		Collections.sort(li);
		for(Integer i : li)
			System.out.print(i+" ");
		sc.close();
	}
	
	public static List<Integer> printDivisor(int num) {
		
		List<Integer> li=new ArrayList<Integer>();
		for( int i=1;i<=Math.sqrt(num);i++) {
			if(num % i == 0)
				if( i != (num/i)) {
				li.add(i);
				li.add((num/i));
				}
				else
					li.add(i);
		}
		return li;
	}

}
