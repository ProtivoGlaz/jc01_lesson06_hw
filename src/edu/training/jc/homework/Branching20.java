package edu.training.jc.homework;
/*
 * Определить, делителем каких чисел а, b, с является число k.
 */
public class Branching20 {

	public static void main(String[] args) {
		int a = 5, b = 10, c = 3;
		int k = 5;
		
		if (k == 0) {
			System.out.println("k = 0\n Делить на ноль нельзя");
			return;
		}
		
		if (a % k == 0) {
			System.out.printf("Число a(%d) делится на k(%d) без остатка\n", a, k);
		}
		if (b % k == 0) {
			System.out.printf("Число b(%d) делится на k(%d) без остатка\n", b, k);
		}
		if (c % k == 0) {
			System.out.printf("Число c(%d) делится на k(%d) без остатка\n", c, k);
		}
	}

}
