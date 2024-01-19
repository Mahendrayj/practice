package com.kn.PizzaOrder;

public class Baker implements Runnable {
  PizzaHut ph;
  int num=0;
  public Baker(PizzaHut ph) {
	  this.ph=ph;
  }
  @Override
public void run() {
	// TODO Auto-generated method stub
	while(true) {
		ph.bake(num++);
	}
}
  
  
}
