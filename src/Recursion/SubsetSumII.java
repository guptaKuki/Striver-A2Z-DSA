package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetSumII {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
		 ArrayList<Integer> al = new ArrayList<>();
		 List<List<Integer>> ans = new ArrayList<>();
		 subsetSumII(arr, 0,al ,ans);
		 System.out.println(ans);
		 sc.close();
	}

	public static void subsetSumII(int arr[] , int index , ArrayList<Integer> al , List<List<Integer>> ans) {
		
	
			ans.add(new ArrayList<Integer>(al));
		
		for( int i=index;i<arr.length;i++) {
			if(i > index && arr[i] == arr[i-1])
				continue;
			
			
			al.add(arr[i]);
			subsetSumII(arr, i+1, al, ans);
			al.remove(al.size()-1);
	
		}
	}
}
