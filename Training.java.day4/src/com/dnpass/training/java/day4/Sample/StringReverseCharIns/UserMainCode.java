package com.dnpass.training.java.day4.Sample.StringReverseCharIns;

public class UserMainCode {
	public static String reshape(String str, char ch) {
		StringBuffer sb = new StringBuffer(str);
		//sb.reverse();
		//System.out.println(sb.insert(1, ch));
		for(int i=1;i<(str.length())*2-1;i+=2) {
			sb.insert(i, ch);
		}
		return sb.reverse().toString();
	}
}
