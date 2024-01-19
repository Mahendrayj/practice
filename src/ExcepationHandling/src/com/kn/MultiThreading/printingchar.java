package com.kn.MultiThreading;

class printingchar implements Runnable {

	@Override
	public void run() {
		System.out.println("Strated printing characters");
		for(int i=65;i<=69;i++) {
			System.out.println("character="+(char)i);
		}try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	
}
