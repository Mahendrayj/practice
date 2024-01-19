package com.kn.Spring5;

public class Engine {
   int engno;
   String engType;

public Engine() {
	super();
	// TODO Auto-generated constructor stub
}


public Engine(int engno, String engType) {
	super();
	this.engno = engno;
	this.engType = engType;
}


public int getEngno() {
	return engno;
}


public void setEngno(int engno) {
	this.engno = engno;
}


public String getEngType() {
	return engType;
}


public void setEngType(String engType) {
	this.engType = engType;
}


@Override
public String toString() {
	return "Engine [engno=" + engno + ", engType=" + engType + "]";
}
   
   
}
