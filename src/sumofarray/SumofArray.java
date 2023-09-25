package com.kn.sumofarray;

public class SumofArray {

	public int[][] findthesumof2dArray(int[][] arr, int[][] brr) {
		// TODO Auto-generated method stub
		int[][] crr=new int[arr.length][brr.length];
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr.length;j++) {
				crr[i][j]=arr[i][j]+brr[i][j];
			}
		}
		return crr;
	}
	

}
