package com.org.tav.handson.day4;

import java.util.Arrays;
import java.util.Iterator;

public class Pricecomparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 p[]=new Product1[2];
		p[0]=new Product1(1, "lays", 28, 8);
		p[1]=new Product1(2, "bingo", 25, 5);
		Arrays.sort(p);
		
		for(Product1 p1:p)
			System.out.println(p1.pid+" "+p1.pname+" "+p1.pprice+" "+p1.prating);
		
		
		
	}

}
