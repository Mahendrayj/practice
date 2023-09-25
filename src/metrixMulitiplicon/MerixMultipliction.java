package com.kn.metrixMulitiplicon;

import java.util.Scanner;

public class MerixMultipliction {

	public static void main(String[] args) {
		// Take the user input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the data for the row1 array1");
		int row1 = sc.nextInt();
		System.out.println("Enter the data for the col1 array1");
		int col1 = sc.nextInt();
		// Decleration and Creation of Array1
		int[][] arr = new int[row1][col1];

		System.out.println("Enter the the data for the row2 array2");
		int row2 = sc.nextInt();
		System.out.println("Enter the data for the col2 array2");
		int col2 = sc.nextInt();
		// Decleration and Creation of Array2
		int[][] brr = new int[row2][col2];
		// Initialization of Array1
		System.out.println("Enter the Elements for the Array1");
		for (int i = 0; i < row1; i++) {
			// System.out.print("[");
			for (int j = 0; j < col1; j++) {
				arr[i][j] = sc.nextInt();
			}
			// System.out.print("]");
		}

		System.out.println("Enter the Elements for the Array2");
		for (int i = 0; i < row2; i++) {
			// System.out.print("[");
			for (int j = 0; j < col2; j++) {
				brr[i][j] = sc.nextInt();
			}
			// System.out.print("]");
		}
		// System.out.println("Enter the Elements for the Array1");
		for (int i = 0; i < row1; i++) {
			System.out.print("[");
			for (int j = 0; j < col1; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("]");
		}

		// printing an Elements
		// System.out.println("Enter the Elements for the Array2");
		for (int i = 0; i < row2; i++) {
			System.out.print("[");
			for (int j = 0; j < col2; j++) {
				System.out.print(brr[i][j]);
			}
			System.out.println("]");
		}
		// Initialzation of crr or matrix multipliction
		int[][] crr = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < col1; k++) {
					crr[i][j] += arr[i][k] * brr[k][j];
				}

			}
		}
		System.out.println("The Resultent Matrix= ");
		for (int i = 0; i < row1; i++) {
			System.out.print("[");
			for (int j = 0; j < col2; j++) {
				System.out.print(crr[i][j] + " ");

			}
			System.out.println("]");
		}
		// Releas the Resource
		sc.close();

	}

}
