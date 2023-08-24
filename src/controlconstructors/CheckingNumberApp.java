package com.kn.controlconstructors;

import java.util.Scanner;

public class CheckingNumberApp {

	public static void main(String[] args) {
		// take input from the users
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		// take input from the user by datatype int
		int num=sc.nextInt();
		CheckingNumber Number=new CheckingNumber();
		Number.CkekstheNumber(num);

	}

}
