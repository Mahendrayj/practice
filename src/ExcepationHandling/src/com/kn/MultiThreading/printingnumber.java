package com.kn.MultiThreading;

class printingnumber implements Runnable {

	@Override
	public void run() {
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
