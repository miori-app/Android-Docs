package kr.ac.sejong.appprogramming.thread1;

public class Thread1 {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		//thread 생성
		Thread t1 = new HelloWorldThread();
		
		// thread 실행
		t1.start();
		
		System.out.println("Hello World 2");
	}

}
