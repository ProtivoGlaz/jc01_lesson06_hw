package edu.training.jc.homework;

/*
 * Подсчитать количество положительных среди чисел а, b, с.
 */
public class Branching19 {

	public static void main(String[] args) {
		double a = 1, b = 0, c = 0;

		int count = 0;

		if (a > 0) {
			count++;
		}
		if (b > 0) {
			count++;
		}
		if (c > 0) {
			count++;
		}
		
		if (count == 0) {
			System.out.println("Среди чисел a, b, c нет положительных");
		} else {
			System.out.printf("Количество положительных чисел count = %d\n", count);
		}
	}

}
