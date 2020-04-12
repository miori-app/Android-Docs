package kr.ac.sejong.appprogramming.java1;

public class Circle {
	// data 추상화
	// member
	private int x;
	private int y;
	private int r;
	
	//getters
	public int getX() {
		return x;
	}
	
	// setters
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public int getR() {
		return r;
	}



	public void setR(int r) {
		this.r = r;
	}

	public Circle() {
		
	}
	// Circle 이 new로 만들어 질때, 생성자 초기화
	/**
	 * x,y,r을 받아 원을 생성하는 생성자
	 * @param x1
	 * @param y1
	 * @param r1
	 */
	public Circle(int x, int y, int r) {
		// local 
		// member 와 local 혼동 => member 변수 지칭위해 this 사용
		this.x = x;
		this.y = y;
		this.r = r;

	}

	// 원의 넓이 return (기능성) -> procedure추상화 (method)
	public double getArea() {
		return 3.14 * r * r;
	}
}
