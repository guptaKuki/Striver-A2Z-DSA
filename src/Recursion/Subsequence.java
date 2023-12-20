package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 ArrayList<Integer> al = new ArrayList<>();
		 printSubSequence(arr , 0,al);
		  sc.close();
	}

	public static void printSubSequence(int arr[], int index, ArrayList<Integer> al) {
		 
		if(index >= arr.length) {
			System.out.println(al);
			return;
		}
		
		al.add(arr[index]);
		printSubSequence(arr, index+1,al);
		al.remove(al.size()-1);
		printSubSequence(arr, index+1, al);
	}
}
