package edu.training.jc.homework;

// Составить таблицу значений функции y = 5 - x^2/2 на отрезке [-5; 5] с шагом 0.5
public class Cycle13 {

	public static void main(String[] args) {
		double a = -5, b = 5;
		double h = 0.5;
		
		while (a <= b) {
			double y = 5 - Math.pow(a, 2) / 2;
			System.out.printf("x = %.1f | y= %.1f\n", a, y);
			a += h;
		}
	}

}
