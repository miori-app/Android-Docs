package kr.ac.sejong.appprogramming.thread1;

public class HelloWorldThread extends Thread {
	// Thread를 상속함으로써 HelloWorldThread는 Thread로 불릴 수 있다.

	// thread 안에 있는 run method 재정의 (=override)
	@Override
	public void run() {
		// hello world 출력
		System.out.println("Hello World 1");
	}
}
