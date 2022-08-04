package com.orgtav.handson;

class mensuration {
	private int l;
	private int b;
	private int r;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
}
class mensu
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mensu m1=new mensu();
		mensuration m=new mensuration();
		m.setB(5);
		m.setL(2);
		m.setR(8);
		int L=m.getL();
		int B=m.getB();
		int R=m.getR();
		System.out.println("area of rec=" + (L*B));
		System.out.println("permiter of rec="+ (L+B));
		System.out.println("area of cir="+ (R*R*Math.PI));
		System.out.println("circumm of cir=" + (2*R*Math.PI));
		

	}

}
