package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceSumK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the sum value :");
		 int sum= sc.nextInt();
		 ArrayList<Integer> al = new ArrayList<>();
		 subSequenceK(arr, 0,al ,sum);
		  sc.close();
	}

	public static void subSequenceK(int arr[] , int index , ArrayList<Integer> al , int sum) {
		
		if(index >= arr.length) {
			int k=0;
			for(int i=0;i<al.size();i++)
				k = k + al.get(i);
			if(k == sum) {
				System.out.println(al);
				return;
			}
			return;
		}
		
		al.add(arr[index]);
		subSequenceK(arr, index+1, al, sum);
		al.remove(al.size()-1);
		subSequenceK(arr, index+1, al, sum);
	}
}
