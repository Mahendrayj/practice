package com.kn.MultiThreading;

public class ThreadDemo2 {
	public static void main(String[] args) {
		printingnumber num=new printingnumber();
		  
		printingchar Char=new printingchar();
		 
		Thread t1=new Thread(num);
		Thread t2=new Thread(Char);
		
		t1.start();
		t2.start();
		
	}
}
