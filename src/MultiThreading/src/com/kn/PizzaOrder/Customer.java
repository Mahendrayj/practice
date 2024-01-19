package com.kn.PizzaOrder;

public class Customer implements Runnable {
	PizzaHut ph;
	  
	  public  Customer() {
	    PizzaHut ph = null; 
		  this.ph=ph;
	  }
	  @Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			int num = 0;
			ph.bake(num++);
		}
}
}