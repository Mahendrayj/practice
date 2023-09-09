package com.kn.pattern1;

public class pattern2 {
   public static void main(String[] args) {
	   int a=9-4;
	   int s=a;
	   int e=a;
	   for(int i=1;i<=5;i++) {
		   for(int j=1;j<=9;j++) {
			   if(j>=a && j>=s && j>=e)
				   if (j%2!=0) {
					   System.out.print("*");
					  
				   }
				   else {
					   System.out.print("");
					   
				   }
			   s--;
			   e++;
		   }
		   System.out.println();
	   }
   }
}
