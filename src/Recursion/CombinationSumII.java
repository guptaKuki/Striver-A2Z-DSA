package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CombinationSumII {

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
		 
//		 HashSet<List<Integer>> res= new HashSet<>();
//		combination(arr, 0,target,al,res);
//		System.out.println(res);
		
		List<List<Integer>> ans = new ArrayList<>();
	    alternativeCombination(arr, n, target, al, ans);
	    for (int i = 0; i < ans.size(); i++) { 
            for (int j = 0; j < ans.get(i).size(); j++) { 
                System.out.print(ans.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        } 
		System.out.println(ans);
		  sc.close();
	}

	public static void combination(int arr[] , int index , int target , ArrayList<Integer> al, HashSet<List<Integer>> res) {
		
		if( index >= arr.length) {
			if( target == 0) {
				res.add(al);
				return;
			}else
				return;
		}
		
		if(arr[index] <= target) {
			al.add(arr[index]);
			combination(arr, index+1, target-arr[index], al,res);
			al.remove(al.size()-1);
		}
		combination(arr, index+1, target, al,res);
	
	}
	
	//Alternative method
	
	public static void alternativeCombination(int arr[], int index, int target, ArrayList<Integer> ds , List<List<Integer>> ans) {
		if( target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for( int i=index;i<arr.length;i++) {
			
			if(i > index && arr[i]==arr[i-1])
				continue;
			
			if(target < arr[i])
				break;
			
			ds.add(arr[i]);
			alternativeCombination(arr, index+1, target-arr[i], ds, ans);
			ds.remove(ds.size()-1);
		}
	}

}
