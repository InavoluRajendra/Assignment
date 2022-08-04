package com.orgtav.handson;

import java.util.Scanner;

public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name=s.next();
		int mmarks=s.nextInt();
		int smarks=s.nextInt();
		int emarks=s.nextInt();
		int csmarks=s.nextInt();
		int total=(mmarks+smarks+emarks+csmarks);
		System.out.println("total="+total);
		int per=(total/4);
		System.out.println("percentage="+per);
		if(per>=85 && per<90)
		{
			System.out.println("grade=A");
		}
		if(per>90)
		{
			System.out.println("grade=A+");
		}

	}

}
