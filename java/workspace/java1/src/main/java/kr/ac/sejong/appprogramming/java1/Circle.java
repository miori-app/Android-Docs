package kr.ac.sejong.appprogramming.java1;

public class Circle {
	// data 추상화
	int x;
	int y;
	int r;

	// 원의 넓이 return (기능성) -> procedure추상화 (method)
	public double getArea() {
		return 3.14 * r * r;
	}
}
