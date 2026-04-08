package com.arrays;

//Q) WAP to print Sum & avg of the Given array ..?
public class TestArrayDemo5 {

	public static void main(String[] args) {

		int[] marks = { 61, 65, 58, 49, 72, 63 };

		double sum = 0;
		double avg = 0;

		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];// 368
		}

		System.out.println("sum of the Marks : " + sum);

		avg = sum / marks.length;

		System.out.println("avg of all the elements : " + avg);//368/6 = 61

	}

}
