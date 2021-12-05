package com.dnpass.training.java.day6.Shape;

public abstract class Shapes {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public Shapes(String name) {
		super();
		this.name = name;
	}

	public abstract double calculateArea();
	public abstract void printArea();
}
