package com.org.tav.handson.day2;
class parent
{
	static int x=2;
	int y=3;
}
class child extends parent
{
	static int x=4;
	int y=5;
}
public class varhid {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new child();
		System.out.println(p.x);
		System.out.println(p.y);
		child c=new child();
		System.out.println(c.x);
		System.out.println(c.y);
		parent p1=new parent();
		System.out.println(p1.x);
		System.out.println(p1.y);
		
		

	}

}
