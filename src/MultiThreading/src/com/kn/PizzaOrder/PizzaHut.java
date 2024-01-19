package com.kn.PizzaOrder;

public class PizzaHut {
    int token;
    boolean isavailable=false;
   synchronized public void bake(int num) {
	   try {
		   if(isavailable==false) {
			   token=num;
			   System.out.println("Bakeed the Pizza for the given token= "+token);
               isavailable=true;
               notify();
		   }else {
			   wait();
		   }
	   
	   }catch (InterruptedException e) {
		e.printStackTrace();
	}
   }
    synchronized public void eat() {
    try {
    	if(isavailable==true) {
       	 System.out.println("Eaten the pizza for token="+token);
         isavailable=false;
         notify();
    	}else {
    		wait();
    	}
    
     }catch (InterruptedException e) {
    	 e.printStackTrace();
	 }
    
     }
}
