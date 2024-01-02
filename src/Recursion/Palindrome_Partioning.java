package Recursion;

import java.util.*;

public class Palindrome_Partioning {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str= sc.next();
		
		List<ArrayList<String>> res = new ArrayList<> ();
		List<String> ds = new ArrayList<>();		
		Partioning(str, 0,ds,res);
		System.out.println(res);
		sc.close();
	}

	public static void Partioning(String str, int index, List<String> ds, List<ArrayList<String>> res) {

		if( index >= str.length()) {
			res.add(new ArrayList<>(ds));
			return;
		}
		
		for( int i =index ;i<str.length();i++) {
			
			if(palindrome(str,index,i)) {
				ds.add(str.substring(index, i+1));
				System.out.println(ds);
				Partioning(str, index+1, ds, res);
				System.out.println(ds);
				ds.remove(ds.size()-1);
			}
		}
	}

	public static boolean palindrome(String str, int s, int e) {
		while(s<=e) {
			if(str.charAt(s) != str.charAt(e))
				return false;
			s++;
			e--;
		}
		return true;
	}

}
