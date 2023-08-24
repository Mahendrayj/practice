package com.kn.AgeCategorizer;

import java.util.Scanner;

public class AgeCategorizerApp {

	public static void main(String[] args) {
		// Take the input from the user 
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the age");
       int age=scan.nextInt();
       //Createing a new Object for AgeCategorizer  
       AgeCategorizer Agecategorize=new AgeCategorizer();
       //Pointing the categorize(age) to the Agecategorize variable and also calling method  
       Agecategorize.categorize(age);
       scan.close();
	}

}
