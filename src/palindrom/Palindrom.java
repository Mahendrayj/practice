package com.kn.palindrom;

public class Palindrom {

	public void Findispalindrom(int num) {
		// TODO Auto-generated method stub
		int digit=0,sum=0,temp=num;
		while(num>0) {
		   digit=num%10;
		   sum=sum*10+digit;
		   num=num/10;
		   
	}
	if(temp==sum) {
	 System.out.println("is palindrom");	
	}else {
		System.out.println("not palindrom");
		
	}
	}
}
