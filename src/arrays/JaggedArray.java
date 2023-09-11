package com.kn.arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// Take the user input
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the base of the Array");
       //Array Decleration and Creation
       int[][] arr=new int[sc.nextInt()][];
       for(int i=0;i<arr.length;i++) {
    	   System.out.println("Enter the size for Array "+(i+1)+"=");
    	   arr[i]=new int[sc.nextInt()];
       }
       //Array Initialaztion
       for(int i=0;i<arr.length;i++) {
    	   System.out.println("Enter the Data for Array "+(i+1)+"=");
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.println("----->Element "+(j+1)+"=");
    		  arr[i][j]=sc.nextInt(); 
    	  }
       }
       //Array travarsing
       for(int i=0;i<arr.length;i++) {
    	   System.out.println("Data for Array "+(i+1)+"=");
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.println("----->Element "+(j+1)+"="+arr[i][j]);
    		   
    	  }
       }  
       //Resource Release
       sc.close();
	}

}
