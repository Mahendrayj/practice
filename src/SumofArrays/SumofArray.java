package SumofArrays;

import java.util.Scanner;

public class SumofArray {

	public int Findthesumofelement(int[] arr) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the data for array"+(i+1)+"=");
		arr[i]=sc.nextInt();
		  sum +=arr[i];	
		}
		return sum;
		
	}
 
}
