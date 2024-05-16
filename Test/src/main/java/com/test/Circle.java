package com.test;

public class Circle extends Area{

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}
	static int a =10;
	void display() {
		System.out.println("drived class + " + a);
	}

	public static void main(String [] args) {
		Area c = new Circle();
		System.out.println(c.area());
		c.display();
	}
}
