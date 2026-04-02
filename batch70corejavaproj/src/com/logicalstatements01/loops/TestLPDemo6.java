package com.logicalstatements01.loops;

/// WAP to print sum of all the numbers 
///using for loop like print sum of first 10 numbers..? 
public class TestLPDemo6 {

	public static void main(String[] args) {
		
		int sum =0;

		for (int i = 0; i <= 10; i++) {
			sum = sum +i;
		}
		
		System.out.println("sum is : " + sum);

	}

}
