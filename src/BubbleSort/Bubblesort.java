package com.kn.BubbleSort;

public class Bubblesort {

	public void bubblesort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			boolean isSwap=false;
		  for(int j=0;j<arr.length-1-i;j++) {
			   if(arr[j]>arr[j+1]) {
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				   isSwap=true;
			   }
		  }
		  if(isSwap==false) {
			  System.out.println("Itreation stoped "+(i+1));
			  break;
		  }
		}
	}

}
