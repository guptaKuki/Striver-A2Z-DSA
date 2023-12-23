package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSumI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
		 ArrayList<Integer> al = new ArrayList<>();
		 ArrayList<Integer> ans = new ArrayList<>();
		 subsetSum(arr, 0,al ,ans);
		 Collections.sort(ans);
		 System.out.println(ans);
		  sc.close();
	}

	public  static void subsetSum(int[] arr, int index, ArrayList<Integer> al, ArrayList<Integer> ans) {

		if( index > arr.length) {
			int sum=0;
			for( Integer i : al)
				sum=sum+al.get(i);
			ans.add(sum);
			return;
		}
		
		al.add(arr[index]);
		subsetSum(arr, index+1, al, ans);
		al.remove(al.size()-1);
		subsetSum(arr, index+1, al, ans);
	}

}
