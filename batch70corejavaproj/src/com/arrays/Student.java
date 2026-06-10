package com.arrays;

//WAP to find sum & avg of 10th class student marks..? 
//99 98 97 96 95 94
public class Student {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double sum = 0;
		for (int m : marks) {
			sum = sum + m;
		}

		double avg = sum / marks.length;

		System.out.println("Total marks : " + sum);
		System.out.println("avg marks : " + avg);

	}

}
