package com.org.tav.handson.day2;

import java.util.Scanner;

public class bsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {21,32,43,56,67,67,78,89};
		int l=arr.length;
		System.out.println("enter number to search");
		int n=sc.nextInt();
		for(int i=0;i<l;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("the number is found at position"+" "+i);
			}
		}

	}

}
