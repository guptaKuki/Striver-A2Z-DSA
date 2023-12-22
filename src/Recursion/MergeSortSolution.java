package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortSolution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 mergeSort(arr, 0,n-1);
		 for( int j=0;j<n;j++) {
			 System.out.print(arr[j]+" ");
			}
		  sc.close();
	}

	public static void mergeSort(int arr[] , int si , int ei) {
		
		if(si >= ei)
			return ;
		int mid= (si + ei)/2;
		
		mergeSort(arr, si, mid);
		mergeSort(arr, mid+1, ei);
		
		merge(arr, si, mid, ei);
	}
	
	public static void merge(int arr[],int si , int mid, int ei) {
		ArrayList<Integer> al= new ArrayList<>();
		
		int left =si;
		int right= mid+1;
		while(left <= mid && right <= ei) {
			if(arr[left] > arr[right]) {
				al.add(arr[right]);
				right++;
			}else {
				al.add(arr[left]);
				left++;
			}
		}
			
			while(left <= mid) {
				al.add(arr[left]);
				left++;
			}
			
			while(right <= ei) {
				al.add(arr[right]);
				right++;
			}
		
			for( int i=si ; i<= ei ;i++) {
				arr[i]=al.get(i-si);
			}
	}
}
