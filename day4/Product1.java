package com.org.tav.handson.day4;


public class Product1 implements Comparable<Product1> {
	int pid;
	String pname;
	int pprice;
	int prating;
	public Product1(int pid, String pname, int pprice, int prating) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.prating = prating;
	}
	public Product1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Product1 o) {
		// TODO Auto-generated method stub
		if(pprice==o.pprice)
			return 0;
		else if(pprice>o.pprice)
			return 1;
		else
			return -1;
	}
	
	
	

}
