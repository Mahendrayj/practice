package com.kn.arrays;

import java.util.Scanner;

public class twodArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the 3d array dimentions");
		int[][][] arr=new int[2][3][4];
        //Initoaliztion of array
		System.out.println("Enter the data for 3d Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=sc.nextInt();
				
				}
			}
		}
		System.out.println("After the Assiging the data");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}

}
