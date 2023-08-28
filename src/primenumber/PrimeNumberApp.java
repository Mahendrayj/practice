package com.kn.primenumber;

import java.util.Scanner;

public class PrimeNumberApp {

	public static void main(String[] args) {
		// Take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//create new object witg]h class
		PrimeNumber primenumbercheck=new PrimeNumber();
		
		
		//call the method
		 boolean primenumbercheck1=primenumbercheck.isPrime(num);
		 System.out.println(num+" : is a prime = "+primenumbercheck1);
		
		//relealse resouce
        sc.close();
	}

}
