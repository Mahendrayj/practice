package com.kn.daemon;

public class daemon {

	public static void main(String[] args) {
		Typing t1=new Typing();
		compilation t2=new compilation();
		Saving t3=new Saving();
		t1.start();
		//System.out.println("****************");
		t2.setDaemon(true);
		t3.setDaemon(true);
		t2.start();
		//System.out.println("****************");
		
		t3.start();
		

	}

}
