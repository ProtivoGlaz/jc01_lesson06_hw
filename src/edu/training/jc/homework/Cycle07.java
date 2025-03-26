package edu.training.jc.homework;

// Вычислить значения функции на отрезке [а,b] c шагом h:
public class Cycle07 {

	public static void main(String[] args) {
		double a = -10, b = 10; // границы отрезка
		double n = 20; // число делений

		double h = Math.abs((b - a) / n); // шаг
		// System.out.println(h);
		while (n >= 0) {
			double x = a;
			double y = 0;

			if (x > 2) {
				y = x;
			} else if (x <= 2) {
				y = -x;
			}

			System.out.printf("n = %.0f\tx = %.2f\ty = %.2f\n", n, x, y);

			a += h;
			n -= 1;
		}

	}

}
