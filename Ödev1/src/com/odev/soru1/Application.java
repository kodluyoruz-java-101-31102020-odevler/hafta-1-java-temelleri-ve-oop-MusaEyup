package com.odev.soru1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		String password = "12345";
		Scanner scan = new Scanner(System.in);
		System.out.println("�ifreinizi giriniz: ");
		String girilen = scan.next();
		
		if(girilen.equals(password)) {
			
			System.out.println("Giri� Ba�ar�l�");
		} 
		else {
			System.out.println("Giri� Ba�ar�s�z");
		}
		scan.close();
	}

}
