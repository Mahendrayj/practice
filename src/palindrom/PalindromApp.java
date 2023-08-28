package com.kn.palindrom;

import java.util.Scanner;

public class PalindromApp {

	public static void main(String[] args) {
		// Take the user input
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int Num=sc.nextInt();
      Palindrom palindrom=new Palindrom();
      palindrom.Findispalindrom(Num);
      sc.close();
	}

}
