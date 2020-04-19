package kr.ac.sejong.appprogramming.thread2;

public class InfinitelyThread extends Thread {

	private String msg;

	public InfinitelyThread(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		while(true)
			System.out.println(msg);
	}

}
