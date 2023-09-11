package com.kn.FindtheIndex;

import java.util.Scanner;

public class FindtheIndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Size of Array");
     //creation and decleration of Array
     int[] arr=new int[sc.nextInt()];
     //Initialization of Array
     for(int i=0;i<arr.length;i++) {
    	 System.out.println("enter the elements to the array");
    	 System.out.println("Enter the element="+(i+1));
    	 arr[i]=sc.nextInt();
     }
     //Take the input to find the element
     System.out.println("Enter the element to find");
     int input=sc.nextInt();
     //print the element
     for(int i=0;i<arr.length;i++) {
     System.out.println(arr[i]+"element="+(i+1));
     //System.out.println("element="+(i+1));
     }
     
     //creation of object to find the index of array
     FindtheIndexoftheArray find=new FindtheIndexoftheArray();
     //creation of metthod and pointout by usig variable find
     int index=find.isFindtheIndexofArray(arr,input);
     if(index>=0) {
    	 System.out.println("element founded in the index= "+index);
     }else {
    	 System.out.println("Element not found in the index");
     }
     //relese the resource
     sc.close();
	}

}
