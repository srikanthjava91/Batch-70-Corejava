package com.arrays;

//4 3 2 1 
// 3 4 2 1 --> 2 3 4 1 
public class TestArrayDemo20 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 2 };

		int temp, j;

		//1<4
		//temp =3 
		//j =1
//		--------------------------
//		1>0 && 4>3 --> 4,4 , 2 ,1  --> 3, 4, 2, 1
//		----------------------------------
		//i = 2 ; 2<4 
//		temp =2 
//		j =2
//		--------------------------
//		2>0 && 4>2 --> 3, 4, 4, 1 --> // 2, 3, 4, 1
//	
//		
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;// 1 2

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}

			arr[j] = temp;

		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
