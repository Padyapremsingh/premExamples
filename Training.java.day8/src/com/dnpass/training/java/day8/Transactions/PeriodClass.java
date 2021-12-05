package com.dnpass.training.java.day8.Transactions;
import java.time.*;

public class PeriodClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1998, Month.FEBRUARY, 20);
		Period p=Period.between(birthday,today);
		//System.out.println(Period.getDays());
		//System.out.println(Period.getMonths());
		//System.out.println(Period.getYears());

		System.out.println("Bidda Nuv Puttinappatikelli Batki Unna Samvastaraalu : "+p.getYears());
		System.out.println("Bidda Nuv Puttinappatikelli Batki Unna Naylalu : "+p.getMonths());
		System.out.println("Bidda Nuv Puttinappatikelli Batki Unna Rojulu : "+p.getDays());
		
		
	}

}
