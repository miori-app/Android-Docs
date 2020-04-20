package kr.ac.sejong.appprogramming.Philosopher;

import java.util.concurrent.Semaphore;

public class DiningTable {

	private Semaphore fork0;
	private Semaphore fork1;
	private Semaphore fork2;
	private Semaphore fork3;
	private Semaphore fork4;

	public DiningTable() {
		fork0 = new Semaphore(1);
		fork1 = new Semaphore(1);
		fork2 = new Semaphore(1);
		fork3 = new Semaphore(1);
		fork4 = new Semaphore(1);
	}

	// 철학자 id 주어졌을떄 왼쪽 포크를 집는다
	public void getLeftFork(int pid) {
		try {
			if (pid == 0) {
				fork4.acquire();
			} else if (pid == 1) {
				fork0.acquire();
			} else if (pid == 2) {
				fork1.acquire();
			} else if (pid == 3) {
				fork2.acquire();
			} else {
				fork3.acquire();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void returnLeftFork(int pid) {
		if (pid == 0) {
			fork4.release();
		} else if (pid == 1) {
			fork0.release();
		} else if (pid == 2) {
			fork1.release();
		} else if (pid == 3) {
			fork2.release();
		} else {
			fork3.release();
		}
	}
	
	// 철학자 id 주어졌을떄 오른쪽 포크를 집는다
	public void getRifhtFork(int pid) {
		try {
			if (pid == 0) {
				fork1.acquire();
			} else if (pid == 1) {
				fork2.acquire();
			} else if (pid == 2) {
				fork3.acquire();
			} else if (pid == 3) {
				fork4.acquire();
			} else {
				fork0.acquire();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void returnRightFork(int pid) {
		if (pid == 0) {
			fork1.release();
		} else if (pid == 1) {
			fork2.release();
		} else if (pid == 2) {
			fork3.release();
		} else if (pid == 3) {
			fork4.release();
		} else {
			fork0.release();
		}
	}
}
