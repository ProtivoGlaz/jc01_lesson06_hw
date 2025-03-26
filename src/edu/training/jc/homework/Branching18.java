package edu.training.jc.homework;

/*
 * Подсчитать количество отрицательных среди чисел а, b, с.
 */
public class Branching18 {

	public static void main(String[] args) {
		double a = -1, b = -1, c = -1;

		int count = 0;

		if (a < 0) {
			count++;
		}
		if (b < 0) {
			count++;
		}
		if (c < 0) {
			count++;
		}

		if (count == 0) {
			System.out.println("Среди чисел a, b, c нету отрицательных");
		} else {
			System.out.printf("Количество отрицательных чисел count = %d\n", count);
		}
	}

}
