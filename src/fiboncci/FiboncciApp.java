package com.kn.fiboncci;

import java.util.Scanner;

public class FiboncciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int range=sc.nextInt();
        Fiboncci fiboncci=new Fiboncci();
        fiboncci.FindfiboncciSeries(range);
        sc.close();
	}

}
