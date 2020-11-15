package com.odev.soru3;

import java.util.Random;

public class Application {

	public static void main(String[] args) {

		int[] numbers = generate();
		
		System.out.println("Dizi elemanlarý:");
		for (int num:numbers) {
			System.out.print(num + " ");
		}
		
		System.out.println("\nOrtalama: " + avg(numbers));

	}
	
	public static int[]  generate() {
		
		int [] numbers = new int[10];
		Random rnd = new Random();
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(100);
		}
		return numbers;
		
	}
	
	public static double avg(int[] nums) {
		
		double sum = 0.0;
		for(int num : nums) {
			sum += num;
		}
		return sum/nums.length;
		
	}

}
