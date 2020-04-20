package kr.ac.sejong.appprogramming.Philosopher;

public class Philosopher implements Runnable{
	
	private DiningTable table;
	private int pid; //철학자가 갖는 id (ex 0,1,2,3,4)
	private String indentation;
	
	public Philosopher(int pid, DiningTable table) {
		this.pid = pid;
		this.table = table;
		// 각 철학자의 메시지를 보여주도록 들여쓰기 미리 만드어두기
		indentation = "";
		for (int i=0; i<pid;i++) {
			indentation += "\t\t";
		}
	}

	@Override
	public void run() {
		while(true) {
			// if (pid ==0) 이것도 됨  -> 즉 하나만 바꿔도 데드락은 풀림
			if  (pid % 2 ==0) {
				System.out.println(indentation + " 왼쪽 포크집기 시도");
				table.getLeftFork(pid);
				System.out.println(indentation + " 오른쪽 포크집기 시도");
				table.getRifhtFork(pid);
			}
			else {
				System.out.println(indentation + " 오른쪽 포크집기 시도");
				table.getRifhtFork(pid);
				System.out.println(indentation + " 왼쪽 포크집기 시도");
				table.getLeftFork(pid);
			}
			System.out.println(indentation + " 포크집기 성공");
			System.out.println(indentation + " 식사");
			System.out.println(indentation + " 왼쪽 포크놓기 시도"); //항상 성공 = 공유자원 놓는거라서
			table.returnLeftFork(pid);
			System.out.println(indentation + " 오른쪽 포크집기 시도");
			table.returnRightFork(pid);
			System.out.println(indentation + " 생각한다");
			
			
			
			
			
		}
		
		
	}

}
