package edu.training.jc.homework;

//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Cycle10 {

	public static void main(String[] args) {
		int mul = 1;
		
		for (int i = 1; i <= 200; i++) {
			mul *= Math.pow(i, 2);
			// System.out.println(Math.pow(i, 2));
		}
		
		System.out.printf("Произведение квадратов первых двухсот чисел равна: %d\n", mul);
	}

}
