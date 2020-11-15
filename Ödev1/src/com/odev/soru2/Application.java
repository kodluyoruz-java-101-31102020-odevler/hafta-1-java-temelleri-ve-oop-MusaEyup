package com.odev.soru2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		menu();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Birinici sayýyý giriniz: ");
		int num1 = scan.nextInt();
		System.out.print("Ýkinci sayýyý giriniz: ");
		int num2 = scan.nextInt();
		System.out.print("Ýþlem seçiniz: ");
		int islem = scan.nextInt();
		
		hesapla(islem, num1, num2);
		
		scan.close();

	}
	
	public static void menu() {
		
		System.out.println("1-toplama\n2-Çýkarma\n3-Çrpma\n4-Bölme");
		
	}
	
	public static void hesapla(int islem, int a, int b){
		
		switch(islem) {
		
		case 1:
			System.out.println("Ýki sayýnýn toplamý: " +  (a+b));
			break;
		case 2: 
			System.out.println("Ýki sayýnýn farký: " +  (a-b));
			break;
		case 3: 
			System.out.println("Ýki sayýnýn çarpýmý: " +  (a*b));
			break;
		case 4: 
			System.out.println("Ýki sayýnýn bölme sonucu: " +  (a/b));
			break;
		default:
			System.out.println("Hatalý iþlem seçtiniz!!");
			break;
			
		}
		
	}

}
