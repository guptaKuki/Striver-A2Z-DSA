package Basic_Maths;

import java.util.Scanner;

public class frequencyofCharacter {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		frequency(str);
//		System.out.println(c);
		sc.close();
	}
	
	public static void frequency(String str) {
		
		int[] arr= new int[26];
		for(int i=0;i<str.length();i++) {
			int ascii= str.charAt(i)-'a';
			arr[ascii]++;
		}
		
		int max=arr[0];
		int maxIndex = 0;
		int secondMaxIndex = -1;
		int smax=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				smax = max;
				max = arr[i];
				secondMaxIndex = maxIndex;
				maxIndex = i;
			}
			else if(arr[i] > smax) {
				secondMaxIndex = i;
				smax = arr[i];
			}
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(smax);
		System.out.println((char)(secondMaxIndex+'a'));
//		return  (char)(smax +'a'-2);
	}
}
