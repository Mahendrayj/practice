package com.kn.SumoftwoArrays;

public class SumofTwoArray {

	public int[] findtheSumofArrays(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int[] crr = new int[arr.length];
		for (int i = 0; i < crr.length; i++) {
			crr[i] = arr[i] + brr[i];
		}
		return crr;
	}

}
