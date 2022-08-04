package com.org.tav.handson.day2;
class emp
{
	int id;
	String name;
	int sal;
	String dep;
	public emp(int id,String name,int sal,String dep)
	{
		super();
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.dep=dep;
	}
}
public class aoobj {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp a[]=new emp[6];
		a[0]=new emp(1, "raju", 20000,"scope");
		a[1]=new emp(2, "harsha", 25000,"scope");
		a[2]=new emp(3, "dheeraj", 28000,"sense");
		a[3]=new emp(4, "dhan", 40000,"smec");
		a[4]=new emp(5, "vasu", 70000,"sense");
		a[5]=new emp(6, "verma", 20500,"scope");
		System.out.println("display");
		for(int i=0;i<a.length;i++)
		 {
			 System.out.println("id = "+a[i].id+" "+" name= "+a[i].name+" sal= "+a[i].sal+" dep= "+a[i].dep);
		 }
		for(int j=0;j<a.length;j++)
		{
			if(a[j].name=="raju")
			{
				System.out.println("raju has id="+a[j].id);
			}
		}
		int maxcount = 0;
	    String element_having_max_freq = "";
	    for (int i = 0; i < 6; i++) {
	      int count = 0;
	      for (int j = 0; j < 6; j++) {
	        if (a[i].dep == a[j].dep) {
	          count++;
	        }
	      }
	 
	      if (count > maxcount) {
	        maxcount = count;
	        element_having_max_freq = a[i].dep;
	      }
	    }
	    System.out.println(element_having_max_freq);

	}

}
