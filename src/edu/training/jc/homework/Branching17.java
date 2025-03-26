package edu.training.jc.homework;

/*
 * Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
 * из исходных, а если равны, то заменить числа нулями.
 */
public class Branching17 {

	public static void main(String[] args) {
		int m = 3;
		int n = 2;

		if (m == n) {
			System.out.println("Числа равны и заменены нулями");
			m = 0;
			n = 0;
			System.out.printf("m = %d\t n = %d\n", m, n);
		} else {
			System.out.println("Числа не равны");
			if (m < n) {
				System.out.println("m меньше n\nЧисла будут заменены на n");
				m = n;
				System.out.printf("m = %d\tn = %d\n", m, n);
			} else {
				System.out.println("n меньше m\nЧисла будут заменены на m");
				n = m;
				System.out.printf("m = %d\tn = %d\n", m, n);
			}
		}
	}

}
