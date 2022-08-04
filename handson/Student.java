package com.orgtav.handson;

public class Student {
	public String name;
	public Student(String name)
	{
		this.name=name;
		System.out.println("name is " + name);
	}
	public Student()
	{
		System.out.println(" name is unknown");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("raju");
		Student s1=new Student();

	}

}
