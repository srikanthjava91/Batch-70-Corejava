package test;

import java.util.Arrays;

public class TestMergeDemo2 {

	public static void main(String[] args) {
		int[] arr = { 6, 5, 4, 3, 2, 1, 9, 8, 1 };

		divide(arr);

		System.out.println("After sorting : " + Arrays.toString(arr));

	}

	static void divide(int[] arr) {

		if (arr.length == 1) {
			return;
		}

		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];

		int i = 0;

		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];
		}

		divide(left);
		System.out.println("Left side : " + Arrays.toString(left));
		divide(right);
		System.out.println("right side : " + Arrays.toString(right));

		mergeSort(left, right, arr);

	}

	static void mergeSort(int[] l, int[] r, int[] arr) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < l.length && j < r.length) {

			if (l[i] < r[j]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[j++];
			}

		}

		while (i < l.length) {
			arr[k++] = l[i++];
		}

		while (j < r.length) {
			arr[k++] = r[j++];
		}

	}

}
