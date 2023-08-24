package com.kn.AgeCategorizer;

public class AgeCategorizer {
    //takeing Agecategorize object and creating method assining an Parametrs as age
	public void categorize(int age) {
		// if condition for checking child is b/w 0-12
		if(age>=0&&age<=12) {
		   System.out.println("child");
		}else if(age>=13&&age<=19){
			System.out.println("Teen");
		}else if(age>=20&&age<=59) {
			System.out.println("Adult");
		}else if(age>=60&&age<=100) {
			System.out.println("Senior");
		}else {
			System.out.println("Invaild age");
		}
		
	}

}
