package Basic_Maths;

public class multithread {

	public static void main(String[] args) {
		ThreadExample t1 =new ThreadExample();
		Thread t= new Thread(t1);
		t.start();
		int i=2;
		while(i > 0) {
			System.out.println(i);
		}
	}

}

class ThreadExample implements Runnable {
	  public  void run() {
		  int i=5;
		  while(i> 0) {
			  System.out.println(i);
		  }
	  }
}


