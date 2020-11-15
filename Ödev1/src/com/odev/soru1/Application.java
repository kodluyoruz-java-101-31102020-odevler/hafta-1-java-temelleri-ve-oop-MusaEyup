package com.odev.soru1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		String password = "12345";
		Scanner scan = new Scanner(System.in);
		System.out.println("Þifreinizi giriniz: ");
		String girilen = scan.next();
		
		if(girilen.equals(password)) {
			
			System.out.println("Giriþ Baþarýlý");
		} 
		else {
			System.out.println("Giriþ Baþarýsýz");
		}
		scan.close();
	}

}
