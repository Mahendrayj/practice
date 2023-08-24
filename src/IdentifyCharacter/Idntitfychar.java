package com.kn.IdentifyCharacter;

public class Idntitfychar {
	// create an method to find the character

	public void findchar(int num) {
		// TODO Auto-generated method stub
		if(num>=65&&num<=90) {
			switch(num) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			
		    	System.out.println("Upper case letter vowle");
		    	break;
			    default: System.out.println("Is not Upper case vowle");
			    
			}
			}
		     else if(num>=97&&num<=122) {
			 switch(num) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			
				System.out.println("lower case vowle letter");
				break;
			    default: System.out.println("Is not lower case vowle");
			 }
		     }
			else if(num>=48&&num<=57) {
				System.out.println("It is digit");
			}
			else if(num>=91&&num<=96){
				System.out.println("It is special character");
			}else {
				System.out.println("invalid input");
			}
				
			}
		
			}
			
			
