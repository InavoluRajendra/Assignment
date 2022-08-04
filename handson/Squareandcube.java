package com.orgtav.handson;

public class Squareandcube {
	static int radius;
	
	static void square()
	{
		System.out.println(radius*radius);
	}
	static void cube()
	{
		System.out.println(radius*radius*radius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radius=3;
		Squareandcube.square();
		Squareandcube.cube();

	}

}
