package com.org.tav.handson.day2;

public class fourtask extends Thread {
	String t;
	public fourtask(String t)
	{
		super();
		this.t=t;
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(t+" "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fourtask f1=new fourtask("core java");
		fourtask f2=new fourtask("advance java");
		fourtask f3=new fourtask("spring");
		fourtask f4=new fourtask("database");
		Thread t1=new Thread(f1);
		Thread t2=new Thread(f2);
		Thread t3=new Thread(f3);
		Thread t4=new Thread(f4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}

}
