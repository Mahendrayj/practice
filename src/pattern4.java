package com.kn.pattern1;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=10;
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=n;j++) {
    		   if(i==1||i==10||j==1||j==10||i==j||(i)==j) {
    			   System.out.print("*");
    		   }else {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
