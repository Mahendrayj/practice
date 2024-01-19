package com.kn.Spring4;

public class Mobile {
   int cost;
   String Brand;
   int RAMSize;

public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}


public Mobile(int cost, String brand, int rAMSize) {
	super();
	this.cost = cost;
	Brand = brand;
	RAMSize = rAMSize;
}


public int getCost() {
	return cost;
}


public void setCost(int cost) {
	this.cost = cost;
}


public String getBrand() {
	return Brand;
}


public void setBrand(String brand) {
	Brand = brand;
}


public int getRAMSize() {
	return RAMSize;
}


public void setRAMSize(int rAMSize) {
	RAMSize = rAMSize;
}


@Override
public String toString() {
	return "Mobile [cost=" + cost + ", Brand=" + Brand + ", RAMSize=" + RAMSize + "]";
}

  
}
