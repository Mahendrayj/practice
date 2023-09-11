package com.kn.SumoftwoArrays;

import java.util.Scanner;

public class SumofArrayApp {

	public static void main(String[] args) {
		// Take the user inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		// creation and decleration of array
		int[] arr = new int[sc.nextInt()];
		// Initialzation array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the data for element"+(i+1)+"=");
			arr[i] = sc.nextInt();
			//System.out.println("Element" + (i + 1) + "=");
		}
		System.out.println("Enter the size of array2");
		// creation and decleration of array
		int[] brr = new int[sc.nextInt()];
		// Initialzation array
		for (int i = 0; i < brr.length; i++) {
			System.out.print("Enter the data for element"+(i+1)+"=");
			brr[i] = sc.nextInt();
			//System.out.println("Element" + (i + 1) + "=");
		}
		// creation of object as SumofTwoArray
		SumofTwoArray find = new SumofTwoArray();
		// callthe method as findtheSumofArrays(arr,brr)with parameters
		int[] crr = find.findtheSumofArrays(arr, brr);
		// coditions for SumofTwoArrays
		//both the array must be same than only we can sumoftwo Array must be add.

		if (arr.length != brr.length) {
			System.out.println("Invalid size of array and can't sumofarray");
			System.exit(0);
		}
		// print the elements in crr
		System.out.print("[");
		for (int i = 0; i < crr.length; i++) {
			if (i == 0) {
				System.out.print(crr[i]);
			} else {
				System.out.print(", " + crr[i]);
			}
		}
		System.out.print("]");
		// release the resource
		sc.close();
	}

}
