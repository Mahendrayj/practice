package com.kn.BinarySearch;

public class BinarySearchApp {

	public int searchtheElement(int[] arr, int key) {

		int strat = 0, end = arr.length - 1, mid = 0;

		while (strat <= end) {
			mid = (strat + end) / 2;
			
			if (arr[mid] == key) {
				 return mid;
			    //System.out.println("Element Founded"+mid);
			}else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				strat = mid + 1;
			}
		}
		return -1;
	

}
}