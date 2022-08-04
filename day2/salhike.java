package com.org.tav.handson.day2;

import java.util.Arrays;
import java.util.Scanner;

public class salhike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		int a[]=new int[3];
		System.out.println("enter 3 salaries");
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<3;j++)
		{
			if(arr[j]>50000 && arr[j]<100000)
			{
				a[j]=arr[j]+((arr[j]*20)/100);
			}
			else if(arr[j]>=100000 && arr[j]<500000)
			{
				a[j]=arr[j]+((arr[j]*25)/100);
			}
			else if(arr[j]>=500000 && arr[j]<1000000)
			{
				a[j]=arr[j]+((arr[j]*28)/100);
			}
		}
		Arrays.sort(a);
		System.out.println("max salary="+a[2]);
		System.out.println("min salary="+a[0]);
		System.out.println("sorted salaries");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}

	}

}
