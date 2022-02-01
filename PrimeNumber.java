package com.javabasic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,i,count = 0;
		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter the Number");
			temp = sc.nextInt();
			for (i = 2; i <= temp; i++) {
				if (temp % i == 0) {
					count++;
					break;
				}
			}
			if(count == 0)
			{
					System.out.println("Number is prime");
			}
					else
					{
					System.out.println("Number is prime");
       				}
			sc.close();
		}
}
	

