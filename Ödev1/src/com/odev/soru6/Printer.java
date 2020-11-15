package com.odev.soru6;

public class Printer {
	
	
	/*
	 * 	static metot nesneye de�il, s�n�fa aittir. nesne olu�turmadan static metotlar� �a��rabiliriz
	 * 	
	 * 	kullan�m� ise  s�n�f_ad� . staticFonksyonad�()
	 * 			
	 * 
	 * */
	
	public static void printPDFDocument(PDFDocument pdfDocument) {
		
		System.out.println(pdfDocument.getBody());
	}
	
	public static void printWordDocument(WordDocument wordDocument) {
		
		System.out.println(wordDocument.getBody());
	}

}
