package com.orgtav.handson;

class circle {
	private double radius=1;
	public circle()
	{
		this.radius=radius;
	}
	public circle(double radius)
	{
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	public double getCircumference()
	{
		return 2*radius*Math.PI;
	}
	public String toString()
	{
		return radius+" ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		System.out.println(c.getCircumference());
		System.out.println(c.getArea());
		System.out.println(c.toString());
		
	
		

	}

}
