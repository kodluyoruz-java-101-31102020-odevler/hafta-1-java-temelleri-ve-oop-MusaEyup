package com.odev.soru6;

public class Printer {
	
	
	/*
	 * 	static metot nesneye deðil, sýnýfa aittir. nesne oluþturmadan static metotlarý çaðýrabiliriz
	 * 	
	 * 	kullanýmý ise  sýnýf_adý . staticFonksyonadý()
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
