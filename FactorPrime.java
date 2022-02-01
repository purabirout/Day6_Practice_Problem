package com.javabasic;

import java.util.Scanner;

public class FactorPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc1.nextInt();

       for(int i=2;i<=num/2;i++)
		{
		while(num % i == 0)
		{
			
			System.out.println(i +"");
    num = num/i;
		}
		if(num>2)
		{
		System.out.println(num);
	}
}
       sc1.close();
}
}