package com.kn.multithreading2;

public class Mythread extends Thread{

	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("Number")) {
			Numberprinting();
		}else if(Thread.currentThread().getName().equalsIgnoreCase("Character")) {
			CharacterPrinting();
		}
		
	}

	public void CharacterPrinting() {
         System.out.println("------>Strated printing character");
         try {
        	 for(int i=65;i<=74;i++) {
        		 System.out.println("Character : "+(char)i);
        		 Thread.sleep(2000);
        	 }
         }catch(InterruptedException e) {
        	 e.printStackTrace();
         }
	}

	public void Numberprinting() {
		System.out.println("------>Strated printing number");
        try {
       	 for(int i=1;i<=10;i++) {
       		 System.out.println("Number : "+i);
       		 Thread.sleep(2000);
       	 }
        }catch(InterruptedException e) {
       	 e.printStackTrace();
        }		
	}
	
}
