package com.kn.revarsenum;

import java.util.Scanner;

public class RevarseNumApp {

	public static void main(String[] args) {
		// Taking the input from the user
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();
       //creating new object and with variable to pointout.
       RevarseNum revarse=new RevarseNum();
       //pointout using revarse variable by  calling the method Findisrevarse(num).
       revarse.Findisrevarse(num);
       //Relese Resource 
       sc.close();
	}

}
