package com.dnpass.training.java.day4.TestBikes;

public interface Horn {
	default void turnAlarmOn()
	{
		System.out.println("turning the cycle bell on");
	}
	default void turnAlarmOff()
	{
		System.out.println("turning the cycle bell on");
	}
}
