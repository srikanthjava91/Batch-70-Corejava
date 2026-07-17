package com.java8features;

import java.util.function.Supplier;

//WAP to print Random  OTP every time.
public class TestJ8Demo16 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		Returns a double value with a positive sign, 
//		greater than or equal to 0.0 and less than 1.0.
//		System.out.println(Math.random() * 10);// 0 to 1 -->

		Supplier<String> s = () -> {
			String otp = "";

			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}

			return otp;
		};

		System.out.println(s.get());

	}

}
