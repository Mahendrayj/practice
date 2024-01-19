package com.kn.MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) {
		printingnumber();
		
		printingchar();
		
	}

	public static void printingchar() {
		System.out.println("Strated printing characters");
		for(int i=65;i<=69;i++) {
			System.out.println("character="+(char)i);
		}try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static void printingnumber() {
		System.out.println("Strated printing number");
		for(int i=1;i<=5;i++) {
			System.out.println("Number="+i);
		}try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
