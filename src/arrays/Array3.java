package com.kn.arrays;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// Take the user input 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size the float Array= ");
		//Array decleartion
		int[] frr=new int[sc.nextInt()];
		//Array Initialzation
		for(int i=0;i<frr.length;i++) {
			System.out.print("Enter the string  of the data for element "+(i+1)+"=");
			frr[i]=sc.nextInt();
		}
        System.out.println("=====>Array Initialzation is done<====");  
        for(int i=0;i<frr.length;i++) {
        	System.out.println((i+1)+" element ="+frr[i]);
        }
        System.out.println("Elements after doubleing");
        int count=1;
        for(int S:frr) {
        	 System.out.println(count++ +"Element= " + S*S);
        }
        sc.close();
	}
      
}
