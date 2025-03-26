package edu.training.jc.homework;

// Вычислить : 1+2+4+8+...+ 2 в 10 степени.
public class Cycle15 {

	public static void main(String[] args) {
		double result = 0;
		
		for (int i = 0; i <= 10; i++) {
			// System.out.printf("i = %d | result = %.2f\n", i, result);
			result += Math.pow(2, i);
		}
		System.out.printf("Результат равен %.2f", result);
	}

}
