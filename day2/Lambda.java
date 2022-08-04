package com.org.tav.handson.day2;

interface i1{ 
    int sum(int x,int y); 
} 
  
public class Lambda{ 
    public static void main(String[] args) { 
          
        // lambda expression with Multiple parameters  
        i1 a=(x,y)->(x+y); 
        System.out.println(a.sum(10,20)); 
          
        // Multiple parameters with data type in lambda expression 
        i1 b=(int x,int y)->(x+y); 
        System.out.println(b.sum(100,200)); 
    } 
}  