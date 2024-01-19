package com.kn.exceapationhandle;

public class InsufficientFundsException extends Exception {
 String s;
public InsufficientFundsException(String s) {
	super(s);

}

public InsufficientFundsException() {
     }

 
}
