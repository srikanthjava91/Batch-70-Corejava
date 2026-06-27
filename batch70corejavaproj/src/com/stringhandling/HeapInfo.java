package com.stringhandling;

public class HeapInfo {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		
//		int[] arr = new int[2000000000]; 

		System.out.println("Initial Heap : " + rt.totalMemory() / (1024 * 1024) + " MB");

		System.out.println("Maximum Heap : " + rt.maxMemory() / (1024 * 1024) + " MB");

		System.out.println("Free Heap : " + rt.freeMemory() / (1024 * 1024) + " MB");
	}
}