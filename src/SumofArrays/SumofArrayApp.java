package SumofArrays;

import java.util.Scanner;

public class SumofArrayApp {

	public static void main(String[] args) {
		// Take the user input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		//Declare and creation of Array
		int[] arr=new int[sc.nextInt()];
		//Create an Object as sumofArrays
		SumofArray element=new SumofArray();
		//call the method
		int result=element.Findthesumofelement(arr);
		System.out.println("Sum of elements = "+result);
        sc.close();
	}
	//Release the resour

}
