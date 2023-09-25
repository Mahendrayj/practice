package com.kn.MergeArray;

import java.util.Scanner;

public class MergedArrayApp {

	public static void main(String[] args) {
		// take the user inputs for the arr
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Array1");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the size of array2");
		int[] brr = new int[sc.nextInt()];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = sc.nextInt();
		}
		int[] crr = new int[arr.length + brr.length];
		for (int i = 0; i < crr.length; i++) {
			if (i >= 0 && i <= arr.length - 1) {
				crr[i] = arr[i];
			} else
				crr[i] = brr[i - arr.length];
		}
		System.out.println("[");
		for(int i=0;i<crr.length;i++) {
			
		}
	}
}