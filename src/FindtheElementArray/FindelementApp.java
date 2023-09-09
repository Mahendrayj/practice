package FindtheElementArray;

import java.util.Scanner;

public class FindelementApp {

	public static void main(String[] args) {
		// Take the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		// creation and Declreation of array
		int[] arr = new int[sc.nextInt()];
		// Initializtion Array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the number to find the Element");
			int input = sc.nextInt();
			// create the class as FindelementinArray
			FindelementinArray element = new FindelementinArray();
			// call the method as findelementinArray
			boolean result = element.findelementinArray(arr, input);
			// print the result
			if (result) {
				System.out.println(input + "is input found " + "=");
			} else {
				System.out.println(input + "is not found " + "=");
			}
		}

	}

}
