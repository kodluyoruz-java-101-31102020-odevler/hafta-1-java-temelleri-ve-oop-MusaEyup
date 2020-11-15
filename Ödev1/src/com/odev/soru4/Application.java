package com.odev.soru4;

public class Application {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// i Satir sayisi j ise sütun sayisi 
		// j, i'den <= olduðu sürece  ekrana * yaz
		
	}

}
