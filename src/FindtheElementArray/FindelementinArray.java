package FindtheElementArray;

import java.util.Scanner;

public class FindelementinArray {

	

	public boolean findelementinArray(int[] arr,int input) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==input) {
				return true;
			}
		}
		return false;
	}
}
	