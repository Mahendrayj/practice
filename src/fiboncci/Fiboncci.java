package com.kn.fiboncci;

public class Fiboncci {

	public void FindfiboncciSeries(int range) {
		// TODO Auto-generated method stub
		int first=0,second=1,next=0;
		if(range==1) {
			System.out.println(first+" "+second);
		}else if(range==2) {
			System.out.println(first+" "+second);
		}else if(range>=3) {
			System.out.println(first+" "+second);
		
		for(int i=1;i<=range;i++) {
			next=first+second;
			first=second;
			second=next;
			System.out.print(" "+next);
		}
	}

}
}
