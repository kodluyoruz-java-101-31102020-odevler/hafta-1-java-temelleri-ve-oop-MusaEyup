package com.odev.soru7;

import java.util.Date;

public class Application {
	public static void main(String[] args) {
		
		Report r = new Report ("a","1", new Date());
		
		Printer.print(r);
	}

}
