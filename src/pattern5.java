package com.kn.pattern1;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
      for(int i=0;i<=n;i++) {
    	  for(int j=0;j<=n;j++){
    		if(i==(n-2)/2||j==0&&i!=0||i==0&&j!=0&&j!=10||j==10&&i!=0) {
    			System.out.print("*");
    		}else {
    			System.out.print(" ");
    		}
    	  }
    	  System.out.println();
      }
	}

}
