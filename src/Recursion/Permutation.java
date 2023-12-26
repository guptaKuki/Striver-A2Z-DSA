package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
		 boolean freq[]= new boolean[n]; // This is a boolean array for checking which element has taken or not
		// System.out.println(freq[0]);
		 ArrayList<Integer> al = new ArrayList<>();
		 List<List<Integer>> ans = new ArrayList<>();
		 printAllPermutation(arr, freq,al ,ans);
		 System.out.println(ans);
		 
		 List<List<Integer>> res = new ArrayList<>();
		 alternateMethod(arr, 0, res);
		 System.out.println(res);
		 sc.close();
	}

	// For this method T.C =   O( n! * n) & S.C = O(n)+ O(n)
	public static void printAllPermutation(int arr[], boolean freq[], ArrayList<Integer> al , List<List<Integer>> ans) {
		
		// All indices are selected
		if(al.size()==arr.length) {
			ans.add(new ArrayList<Integer>(al));
			return;
		}
		
		for( int i=0;i<arr.length;i++) {
			//If the element is not selected then the element will add to al and call recursion.
			if(!freq[i]) {
				al.add(arr[i]);
				freq[i]= true;
				printAllPermutation(arr, freq, al, ans);
				al.remove(al.size()-1);
				freq[i]=false;
			}
		}
	}
	
	//Alternate Method whose T.C = O(n! * n) & S.C = O(n)
	
	public static void alternateMethod(int arr [], int index , List<List<Integer>> ans) {
		 
		if( index >= arr.length) {
		// Copy the ds to ans
		 ArrayList<Integer> ds = new ArrayList<>();
		 for(int i=0;i<arr.length;i++)
			 ds.add(arr[i]);
		 
		 ans.add(new ArrayList<Integer> (ds));
		 return;
		}
		 
		for( int i=index ;i<arr.length;i++) {
			swap(arr, i,index);
			alternateMethod(arr, index+1, ans);
			swap(arr,i,index);
		}
	}
	public static void swap( int arr[], int i , int index) {
		int temp= arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
	}
}
