package edu.training.jc.homework;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
 * прямоугольным.
 */
public class Branching14 {

	public static void main(String[] args) {
		// углы треугольник
		int alpha = 60, beta = 30;
		int gamma;
		
		if (alpha + beta < 180) {
			gamma = 180 - (alpha + beta);
			System.out.printf("Тругольник существует.\nЕго углы: Альфа = %d;\tБета = %d;\tГамма = %d\n", alpha, beta, gamma);
			if (alpha == 90 || beta == 90 || gamma == 90) {
				System.out.println("Треугольник является прямоугольным.");
			}
		} else {
			System.out.println("Такого треугольника не существует.");
		}
		
	}

}
