package Recursion;

public class printName {

	public static void main(String[] args) {
		int count=0;
		print(count);
	}

	public static void print(int count) {
		
		if(count == 5)
			return;
		System.out.println("Kuki");
		count++;
		print(count);
	}
}
