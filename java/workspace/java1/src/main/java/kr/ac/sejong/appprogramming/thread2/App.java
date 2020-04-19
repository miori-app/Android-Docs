package kr.ac.sejong.appprogramming.thread2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new InfinitelyThread("A");
		Thread t2 = new InfinitelyThread("\tB");
		
		t1.start();
		t2.start();
		
	}

}
