package com.dnpass.training.java.day3;
public class RoadBike extends Bicycle {

	private int tires;
	public RoadBike(int strtspeed, int strtcadence,int strtgear,int tirelength)
	{
		super(strtspeed,strtcadence,strtgear);
		this.tires = tirelength; 
	}
	public void settire(int tirelength)
	{
		this.tires = tirelength;
	}
	public int gettire()
	{
		return this.tires;
	}
	public void printDescription()
    {
		super.printDescription();
        System.out.println( "The Roadbike has "+this.tires+ "MM tires.");
        
    } 

}