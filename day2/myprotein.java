package com.org.tav.handson.day2;
class protein
{
	public protein()
	{
		System.out.println("Proteins are made up of amino acids");
		System.out.println("Protein is one of the basic building blocks of the Human body.");
	}
}
class source extends protein
{
	public source()
	{
		super();
		System.out.println("Hair, Skin, Eyes, Muscles, and organs are all made up of Protein");
		System.out.println("Source of Proteins are milk, eggs, meat, pulses, soybeans");
	}
}

public class myprotein extends source{
	public myprotein()
	{
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myprotein m=new myprotein();

	}

}
