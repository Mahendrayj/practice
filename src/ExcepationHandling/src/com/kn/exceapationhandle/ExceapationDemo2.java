package com.kn.exceapationhandle;

import java.util.Scanner;



public class ExceapationDemo2 {

	public static void main(String[] args) {
		InsufficientFundsException e1=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Well com to the SBI");
		System.out.println("withdraw the amount= ");
		double amount=sc.nextDouble();
		try {
			withdraw(amount);
		}catch(InsufficientFundsException e) {
			e.printStackTrace();
		}
		
	}

	public static void withdraw(double amount)throws InsufficientFundsException {
		int balance=10000;
		if(balance<=amount) {
			System.out.println("Succesfully wiothdrawal"+amount+"avilable balance"+(balance-amount));
		}else {
			throw new InsufficientFundsException("balance is too low");
		}
	}

}
