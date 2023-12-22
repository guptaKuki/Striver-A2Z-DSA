package Recursion;

import java.util.Scanner;

public class QucikSortSolution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 quickSort(arr, 0,n-1);
		 for( int j=0;j<n;j++) {
			 System.out.print(arr[j]+" ");
			}
		  sc.close();
	}

	public static void quickSort(int arr[] , int si , int ei) {
		if(si >= ei)
			return;
		
		int ps = partition(arr, si, ei);
		quickSort(arr, si, ps);
		quickSort(arr , ps+1,ei);
	}
	
	public static int partition(int arr[], int si, int ei) {
		 int pivot= arr[si];
		 int count=0;
		 for( int i =si+1 ; i<= ei ;i++) {
			 if( pivot > arr[i])
				 count++;
		 }
		
		 int pivotPos = si+count;
		 arr[si]= arr[pivotPos];
		 arr[pivotPos]= pivot;
		 
		 int m=si;
		 int n=ei;
		 
		 while( m < pivotPos && n > pivotPos) {
			 if(arr[m] < pivot)
				 m++;
			 if(arr[n]> pivot)
				 n--;
			 
			 if( arr[m] > pivot && arr[n] < pivot) {
				 int temp= arr[m];
				 arr[m]=arr[n];
				 arr[n]=temp;
				 m++;
				 n--;
			 }
		 }
		return pivotPos;
	}
}
