package com.kn.daemon;

class compilation extends Thread{

	@Override
	public void run() {
		try {
			for(int i=1; ;i++) {
				System.out.println("=====>compailing code : "+i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
