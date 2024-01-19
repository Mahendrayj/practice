package com.kn.daemon;

class Typing extends Thread{

	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Typing code");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
