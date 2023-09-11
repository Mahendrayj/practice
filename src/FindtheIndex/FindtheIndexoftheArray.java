package com.kn.FindtheIndex;

public class FindtheIndexoftheArray {

	public int isFindtheIndexofArray(int[] arr, int input) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==input) {
				return i;
			}
		}
		return -1;
	}

}
