package com.dnpass.training.java.day3;

public class MotorBike extends Bicycle {

	private String suspension;
	public MotorBike(int strtspeed, int strtcadence,int strtgear,String suspensiontype)
	{
		super(strtspeed,strtcadence,strtgear);
		this.suspension = suspensiontype; 
	}
	public void setsuspension(String suspensiontype)
	{
		this.suspension = suspensiontype;
	}
	public String getsuspension()
	{
		return this.suspension;
	}
	public void printDescription()
    {
		super.printDescription();
        System.out.println("The Mountainbike has "+this.suspension+ " suspension.");
        
    } 
}