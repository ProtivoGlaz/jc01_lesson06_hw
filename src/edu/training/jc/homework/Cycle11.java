package edu.training.jc.homework;

// Составить программу нахождения разности кубов первых двухсот чисел
public class Cycle11 {

	public static void main(String[] args) {
		int result = 0;
		
		for(int i = 1; i <= 200; i++) {
			result -= Math.pow(i, 3);
			// System.out.println(Math.pow(i, 3));
			// System.out.println(result);
		}
		System.out.printf("Разность кубов первых двухсот чисел равна: %d\n", result);
	}

}
