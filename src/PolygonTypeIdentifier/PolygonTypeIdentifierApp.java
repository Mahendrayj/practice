package com.kn.PolygonTypeIdentifier;

import java.util.Scanner;

public class PolygonTypeIdentifierApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the sides");
       int sides=sc.nextInt();
       PolygonTypeIdentifier Identifier=new PolygonTypeIdentifier();
       Identifier.polygonside(sides);
       sc.close();
	}

}
