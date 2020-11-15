package com.odev.soru2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		menu();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Birinici say�y� giriniz: ");
		int num1 = scan.nextInt();
		System.out.print("�kinci say�y� giriniz: ");
		int num2 = scan.nextInt();
		System.out.print("��lem se�iniz: ");
		int islem = scan.nextInt();
		
		hesapla(islem, num1, num2);
		
		scan.close();

	}
	
	public static void menu() {
		
		System.out.println("1-toplama\n2-��karma\n3-�rpma\n4-B�lme");
		
	}
	
	public static void hesapla(int islem, int a, int b){
		
		switch(islem) {
		
		case 1:
			System.out.println("�ki say�n�n toplam�: " +  (a+b));
			break;
		case 2: 
			System.out.println("�ki say�n�n fark�: " +  (a-b));
			break;
		case 3: 
			System.out.println("�ki say�n�n �arp�m�: " +  (a*b));
			break;
		case 4: 
			System.out.println("�ki say�n�n b�lme sonucu: " +  (a/b));
			break;
		default:
			System.out.println("Hatal� i�lem se�tiniz!!");
			break;
			
		}
		
	}

}
