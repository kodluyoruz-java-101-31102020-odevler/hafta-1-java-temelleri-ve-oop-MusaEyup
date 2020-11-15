package com.odev.soru6;

public class Application {

	public static void main(String[] args) {

		PDFDocument pdfDocument = new PDFDocument("PDFDocument body");
		
		WordDocument wordDocument = new WordDocument("WordDocument body");
		
		
		Printer.printPDFDocument(pdfDocument);
		
		Printer.printWordDocument(wordDocument);
		
	}

}
