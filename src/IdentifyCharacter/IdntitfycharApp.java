package com.kn.IdentifyCharacter;

import java.util.Scanner;

public class IdntitfycharApp {

	public static void main(String[] args) {
		// Take the input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char character=sc.next().charAt(0);
	    int num=(int)character;
		//create an new object is an Idntitfychar
		Idntitfychar Character=new Idntitfychar();
		//call the method for check the char
		 Character.findchar(character);
		 //close the scanner statement
		 sc.close();
		 
       
	}

}
