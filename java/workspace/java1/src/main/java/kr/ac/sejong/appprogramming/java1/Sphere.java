package kr.ac.sejong.appprogramming.java1;

public class Sphere extends Circle{
	// data
	private int z;
	
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Sphere(int x, int y, int z, int r) {
		//setX(x);
		//setY(y);
		//setR(r);
		super(x,y,r);
		this.z = z;
	}
	
	//procedure
	public double getVolumn() {
		return 4/3.0*3.14*getR()*getR()*getR();
	}
}
