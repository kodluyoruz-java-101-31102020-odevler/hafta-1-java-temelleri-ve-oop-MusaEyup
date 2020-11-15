package com.odev.soru5;

import java.util.Random;

public class Application {

	public static void main(String[] args) {

		int[] numbers = generate();
		
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + " Çift");
			}
			else {
				System.out.println(numbers[i] + " Tek");
			}
			
		}
		
		
	}
	public static int[] generate() {
		
		int[] nums = new int[100];
		Random rnd = new Random();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt();
		}
		
		return nums;
		
	}

}
