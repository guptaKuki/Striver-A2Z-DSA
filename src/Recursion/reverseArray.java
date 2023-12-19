package Recursion;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int revarr[]= reverse(arr, 0, n-1);
		for(int i=0;i<n;i++)
			System.out.print(revarr[i]+" ");
		sc.close();
		
	}
	public static int[] reverse(int arr[] , int start , int end) {
		
		if(start >= end)
			return arr;
		swap(arr,start,end);
		return reverse(arr, start+1, end-1);
	}

	public static void swap(int arr[], int s, int e) {
		int temp =arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
	}
}
