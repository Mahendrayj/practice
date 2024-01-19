package com.kn.exceapationhandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceapationDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter the age= ");
		int age=sc.nextInt();
		System.out.println("your age= "+age);
		System.out.println("***********************");
		System.out.println("Enter the neomerateor= ");
        int n=sc.nextInt();
        System.out.println("Enter the Denomenator= ");
        int d=sc.nextInt();
        double quotient=n/d;
        System.out.println("divition= "+quotient);
        int[] arr=new int[sc.nextInt()];
        System.out.println("Array Size= "+arr.length);
        
	}catch(InputMismatchException e) {
		System.out.println("Invalid input for given,age must be in numarice");
	}catch(ArithmeticException e) {
		System.out.println("---->Denomentor must be zero");
	}catch(NegativeArraySizeException e) {
		System.out.println("---->Array size must be positive value");
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("-----------END---------------");
	sc.close();
	}

}
