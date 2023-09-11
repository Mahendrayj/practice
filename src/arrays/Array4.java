package com.kn.arrays;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// Take the user inputs from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3d array sizes");
		int[][][] arr=new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
		for(float i=0;i<arr.length;i++) {
			System.out.println("Enter the data for 3d array "+(i+1)+"element for i"+" "+"=");
			
			for(float j=0;j<arr[(int) i].length;j++) {
				System.out.println("Enter the data for 3d array "+(j+1)+"element for j"+" "+"=");
				for(float k=0;k<arr[(int) i][(int) j].length;k++) {
					System.out.println("Enter the data for 3d array "+(k+1)+"element for k"+" "+"=");
					
					arr[(int) i][(int) j][(int) k]=(int) sc.nextDouble();
				}
			}
		}
		System.out.println("after the Initialaztion");
		//int[][][] arr=new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
		//	System.out.println((i+1)+" element ="+arr[i]);
        
			for(int j=0;j<arr[i].length;j++) {
			//System.out.println((i+1)+" element ="+arr[j]);
				for(int k=0;k<arr[i][j].length;k++) {
					//System.out.println((i+1)+" element ="+arr[k]);
					System.out.print(arr[i][j][k]+" ");
		
				}
				System.out.println();
	}

}
}
}