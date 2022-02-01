package com.javabasic;

public class CouponNumber {

	public static void main(String[] args) {
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random = (int) (Math.random() * max);
		String sb = "";


		while (random > 0) {
			sb = sb + (chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);
	}
		
		
}
