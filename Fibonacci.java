package com.javabasic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=0,b=1,c,count=10;
     System.out.println(a +" "+b);
     for(int i=2;i<=count;i++)
     {
     c = a+b;
     System.out.println(c);
     a = b;
     b = c;
     
	}

}
}