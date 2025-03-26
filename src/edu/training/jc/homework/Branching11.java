package edu.training.jc.homework;

// Составить программу, которая определит площадь какого треугольника больше.
public class Branching11 {

	public static void main(String[] args) {
		double a1 = 4, b1 = 4.5, c1 = 2; // стороны первого треугольника
		double a2 = 4, b2 = 4.5, c2 = 2; // стороны второго треугольника

		if (a2 + b2 > c2 && b2 + c2 > a2 && a2 + c2 > b2) {
			if (a1 + b1 > c1 && b1 + c1 > a1 && a1 + c1 > b1) {
				System.out.println("Первый треугольник существует");
			} else {
				System.out.println("Первый треугольник не существует");
				return;
			}
			System.out.println("Второй треугольник существует");
		} else {
			System.out.println("Второй треугольник не существует");
			return;
		}

		double p1, p2, S1, S2; // p1 и p2 полупериметры первого и второго треугольников, а S1 и S2 их площади

		p1 = (a1 + b1 + c1) / 2;
		p2 = (a2 + b2 + c2) / 2;

		// System.out.printf("p1 = %.2f\tp2 = %.2f\n", p1, p2);

		S1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		S2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

		// System.out.printf("S1 = %.2f\tS2 = %.2f\n", S1, S2);

		if (S1 < S2) {
			System.out.printf("Площадь второго треугольника больше (S1 = %.2f; S2 = %.2f)", S1, S2);
		} else if (S2 < S1) {
			System.out.printf("Площадь первого треугольника больше (S1 = %.2f; S2 = %.2f)", S1, S2);
		} else {
			System.out.printf("Площади треугольников равны (S1 = %.2f; S2 = %.2f)", S1, S2);
		}

	}

}
