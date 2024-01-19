package com.kn.Spring1;

public class Laptop {
 int srno;
 String brand;
 float cost;

public Laptop() {
	super();
  }


public Laptop(int srno, String brand, float cost) {
	super();
	this.srno = srno;
	this.brand = brand;
	this.cost = cost;
}


public int getSrno() {
	return srno;
}


public void setSrno(int srno) {
	this.srno = srno;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public float getCost() {
	return cost;
}


public void setCost(float cost) {
	this.cost = cost;
}


@Override
public String toString() {
	return "Laptop [srno=" + srno + ", brand=" + brand + ", cost=" + cost + "]";
}


 
}
