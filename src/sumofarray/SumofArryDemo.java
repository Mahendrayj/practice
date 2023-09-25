package com.kn.sumofarray;

import java.util.Scanner;

public class SumofArryDemo {

	public static void main(String[] args) {
		// Take the user input from user for Array1
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of Array1");
		//Decleration and creation of array
		int[][] arr=new int[sc.nextInt()][sc.nextInt()];
		//Intitalization of array1
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Size of Array2");
		//Decleration and creation of array
		int[][] brr=new int[sc.nextInt()][sc.nextInt()];
		//Intitalization of array1
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr.length;j++) {
				brr[i][j]=sc.nextInt();
			}
		}
		
		//creation of object as SumofArray
		SumofArray sumof2d=new SumofArray();
		//call the method as findthesumof2dArray()
		int[][] crr=sumof2d.findthesumof2dArray(arr,brr);
		//codition for the array
		
		
		//Travarsing an Array
		//System.out.print("[");
		for(int i=0;i<crr.length;i++) {
			System.out.print("[");
			for(int j=0;j<crr.length;j++) {
				
				System.out.print(crr[i][j]);
			
			}System.out.println("]");
		}
		if(arr.length!=brr.length) {
			System.out.println("Invalid input");
		}
		
		//Release the Resource
          sc.close();
	}

}
