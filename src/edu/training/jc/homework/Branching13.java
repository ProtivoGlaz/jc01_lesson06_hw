package edu.training.jc.homework;

/*
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к
 * началу координат.
 */
public class Branching13 {

	public static void main(String[] args) {
		// координаты точек
		double x1 = 2, y1 = 6;
		double x2 = -5, y2 = -4;

		// Расчёт расстояния
		double distanceA = Math.hypot(x1, y1);
		double distanceB = Math.hypot(x2, y2);

		// Сравнение и вывод
		if (distanceA < distanceB) {
			System.out.printf(
					"Расстояние от точки A (%.2f) к началу координат ближе, чем расстояние от точки B(%.2f).\n",
					distanceA, distanceB);
		} else if (distanceB < distanceA) {
			System.out.printf(
					"Расстояние от точки B (%.2f) к началу координат ближе, чем расстояние от точки A(%.2f).\n",
					distanceA, distanceB);
		} else {
			System.out.printf("Расстояния равны.\nA = %.2f\tB = %.2f\n", distanceA, distanceB);
		}

	}

}
