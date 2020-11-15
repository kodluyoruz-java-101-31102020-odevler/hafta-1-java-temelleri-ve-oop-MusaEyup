package com.odev.soru7;

import java.util.Date;

public class DatabaseOperations {
	
	public static void open() {
		System.out.println("opened");
	}
	
	
	public static Report runQuery(String q) {
		
		Report r1 = new Report("b", "2", new Date());
		
		
		return r1;
	}

}
