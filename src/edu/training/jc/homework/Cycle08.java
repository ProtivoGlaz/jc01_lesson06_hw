package edu.training.jc.homework;

// Вычислить значения функции на отрезке [а,b] c шагом h:
public class Cycle08 {

	public static void main(String[] args) {
		double a = -10, b = 15, c = 3; // границы отрезка
		double n = 20; // число делений

		double h = Math.abs((b - a) / n); // шаг
		// System.out.println(h);
		while (n >= 0) {
			double x = a;
			double y = 0;

			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = (x - c) + 6;
			}

			System.out.printf("n = %.0f\tx = %.2f\ty = %.2f\n", n, x, y);

			a += h;
			n -= 1;
		}
	}

}
