package edu.training.jc.homework;

// Найти сумму квадратов первых ста чисел.
public class Cycle09 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += Math.pow(i, 2);
			// System.out.println(Math.pow(i, 2));
		}
		System.out.printf("Сумма квадратов первых ста чисел равна: %d", sum);
	}

}
