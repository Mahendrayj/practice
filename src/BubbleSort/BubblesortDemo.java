package com.kn.BubbleSort;

import java.util.Scanner;

public class BubblesortDemo {

	public static void main(String[] args) {
		// Take the user input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		//Declreation and creation of Array
		int[] arr=new int[sc.nextInt()];
		//Intialization of array
		System.out.println("Enter the data for array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//creation of object
		Bubblesort bs=new Bubblesort();
		//call the method as bubblesort
		bs.bubblesort(arr);
		//traversing of array
		System.out.println("Before Bubble sorting an Array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("After Bubble sorting an Array");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
	}

}
