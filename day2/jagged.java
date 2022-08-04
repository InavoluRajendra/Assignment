package com.org.tav.handson.day2;

import java.util.Scanner;

public class jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nor;
        System.out.println("Enter the number of rows for jagged arrays");
        nor=sc.nextInt();     
        
        
        int arr[][] = new int[nor][];
        
        
        System.out.println("Enter the number of columns for each rows of jagged arrays");
        for(int i=0;i<nor;i++)
        {
            arr[i]=new int[sc.nextInt()];
        }
        
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++)   
        {
            for (int j = 0; j < arr[i].length; j++)  
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++)    
        {
            for (int j = 0; j < arr[i].length; j++)    
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
		
		

	}


