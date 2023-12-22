package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target :");
		int target= sc.nextInt();
		 ArrayList<Integer> al = new ArrayList<>();
		 
		combination(arr, 0,target,al);
		  sc.close();
	}

	public static void combination(int arr[] , int index , int target , ArrayList<Integer> al) {
		
		if( index >= arr.length) {
			if( target == 0) {
				System.out.println(al);
				return;
			}else
				return;
		}
		
		al.add(arr[index]);
		if(arr[index] <= target)
			combination(arr, index, target-arr[index], al);
		al.remove(al.size()-1);
		combination(arr, index+1, target, al);
	}
}
