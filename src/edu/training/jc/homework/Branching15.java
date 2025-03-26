package edu.training.jc.homework;

/*
 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их
 * суммы, а большее — их удвоенным произведением.
 */
public class Branching15 {

	public static void main(String[] args) {
		double x = 2, y = 4;

		double result_x, result_y;

		System.out.printf("x = %.1f;\ty = %.1f\n", x, y);

		if (x < y) {
			result_x = (x + y) / 2;
			result_y = x * y * 2;
			System.out.printf("x меньше y.\nРезультат: x = %.2f\ty = %.2f\n", result_x, result_y);

		} else if (y < x) {
			result_x = x * y * 2;
			result_y = (x + y) / 2;
			System.out.printf("x больше y.\nРезультат: x = %.2f\ty = %.2f\n", result_x, result_y);
		} else {
			System.out.println("Числа равны.");
		}
	}

}
