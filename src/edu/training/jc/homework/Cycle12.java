package edu.training.jc.homework;
/*
 * Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
 * нахождения произведения первых 10 членов этой последовательности.
 */
public class Cycle12 {

	public static void main(String[] args) {
		int a = 1;
		long result = 1;
		
		for (int i = 1; i <= 10; i++) {
			result *= a;
			a = 6 + a;
			
			System.out.printf("a(%d) = a\nРезультат: %d\n", i, result);
		}
	}

}
