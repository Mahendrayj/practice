package com.kn.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchElement {

	public static void main(String[] args) {
		// Take the user input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int[] arr=new int[sc.nextInt()];
		//Initialization of Array
		System.out.println("Enter the Elements to the Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to Find");
		int key=sc.nextInt();
		//Elements should be sorted
		Arrays.sort(arr);
		//create an object with the class BinarySearchApp
		BinarySearchApp search=new BinarySearchApp();
		//call the as searchtheElement
		int brr=search.searchtheElement(arr, key);
		
		if(brr>=0) {
			System.out.println(key+" fonuded at position "+(brr+1));
		}else {
			System.out.println("Not founded");
		}
		//Release the Resource
		sc.close();
         
	}

}
