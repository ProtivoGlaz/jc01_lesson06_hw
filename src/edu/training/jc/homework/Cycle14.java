package edu.training.jc.homework;

// Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
public class Cycle14 {

	public static void main(String[] args) {
		double result = 1;
		
		int n = 5;
		
		for (int i = 2; i <= n; i++) {
			result += Math.pow(i, -1);
			// System.out.println(result);
		}
		System.out.printf("Результат: %.2f", result);
	}

}
