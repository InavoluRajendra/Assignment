package com.orgtav.handson;

import java.util.Scanner;

public class press3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter quantity");
		int ncp=s.nextInt();
		System.out.println("price is");
		if(ncp>0 && ncp<=99)
		{
			System.out.println(ncp*30);
		}
		if(ncp>=100 && ncp<=499)
		{
			System.out.println(ncp*28);
		}
		if(ncp>=500 && ncp<=799)
		{
			System.out.println(ncp*27);
		}
		if(ncp>800 && ncp<=1000)
		{
			System.out.println(ncp*26);
		}
		if(ncp>1000)
		{
			System.out.println(ncp*25);
		}

	}

}
