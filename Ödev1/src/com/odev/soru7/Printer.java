package com.odev.soru7;

public class Printer {
	
	public static void print(Report r) {
		System.out.println("Name: " + r.getName());
		System.out.println("Resault: " + r.getResult());
		System.out.println("Date: " + r.getCreateDate());
	}

}
