package com.javabasic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		 int digit, reversed = 0;
		    
		    System.out.println("Original Number: " + num);

		    while(num != 0) {
		       digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
		    sc.close();
	}

}
