package com.kn.multithreading2;

public class SingleRunMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mythread t1=new Mythread();
        t1.setName("Number");
        t1.start();
        Mythread t2=new Mythread();
        t2.setName("Character");
        t2.start();
        
	}

}
