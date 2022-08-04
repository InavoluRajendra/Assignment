package com.org.tav.handson.day4;
import java.util.Arrays;
import java.util.Comparator;

class pricecomparator implements Comparator<Product>{

@Override
public int compare(Product o1, Product o2) {
// TODO Auto-generated method stub
if(o1.price==o2.price)
return 0;
else if(o1.price>o2.price)
return 1;
else if(o1.price<o2.price)
return -1;
return 0;
}

}
class ratingcomparator implements Comparator<Product>{

@Override
public int compare(Product o1, Product o2) {
// TODO Auto-generated method stub
if(o1.rating==o2.rating)
return 0;
else if(o1.rating>o2.rating)
return 1;
else if(o1.rating<o2.rating)
return -1;
return 0;
}}

public class Comparatordemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pds=new Product[5];
		pds[0]=new Product(1, "TV1", 40000, 3.5);
		pds[1]=new Product(2, "TV2", 35000, 2.5);
		pds[2]=new Product(3, "TV3", 36000, 3);
		pds[3]=new Product(4, "TV4", 41000, 4);
		pds[4]=new Product(5, "TV5", 50000, 1.5);

		Arrays.sort(pds,new pricecomparator());
		System.out.println("Pricing wise sorted array");
		for(Product p:pds)
		{
		System.out.println(p.toString());
		}
		Arrays.sort(pds, new ratingcomparator());
		System.out.println("Rating wise sorted array");
		for(Product p:pds)
		{
		System.out.println(p.toString());
		}

	}
}
