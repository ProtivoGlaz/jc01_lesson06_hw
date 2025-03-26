package edu.training.jc.homework;

/*
 * Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую
 * степень — отрицательные.
 */
public class Branching12 {

	public static void main(String[] args) {
		double a = Math.PI;
		double b = Math.sqrt(5);
		double c = -1.3;

		System.out.printf("Первое число: %.2f\tРезультат: %.2f\n", a, func(a));
		System.out.printf("Второе число: %.2f\tРезультат: %.2f\n", b, func(b));
		System.out.printf("Третье число: %.2f\tРезультат: %.2f\n", c, func(c));
	}

	public static double func(double num) {

		if (num < 0) {
			return Math.pow(num, 4);
		} else {
			return Math.pow(num, 2);
		}
	}

}
