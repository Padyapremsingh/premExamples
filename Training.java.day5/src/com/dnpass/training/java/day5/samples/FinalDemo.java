package com.dnpass.training.java.day5.samples;

public class FinalDemo {
static final int MAX_WIDTH;
final int i;
{
	i=10;
}

FinalDemo(){
	//i=0
}

static {
	MAX_WIDTH=999;
}

static class hello{
	void sayHello() {
		System.out.println("Hello");
	}
}
static class world extends hello{
	void sayHello() {
		System.out.println("World!");
	}
}
public static void main(String[] args) {
	final int i;
	i=100;
	final world w1= new world();
	w1.sayHello();
	
}
}
