package com.clc;

public class Farmer {
	private String fName;
	private String aAge;
	private String aType;
	private int aPrice;
	
	public Farmer(String fName, String aAge, String aType, int aPrice) {
		this.fName = fName;
		this.aAge = aAge;
		this.aType = aType;
		this.aPrice = aPrice;
	}
	public void printAnimal() {
		System.out.println("Hi " + fName + " your " + aType + " is " + aAge + " years " + "and costs " + aPrice + " shs. " );
	}

}
