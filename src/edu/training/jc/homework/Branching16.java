package edu.training.jc.homework;

/*
 * На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком
 * координатном угле).
 */
public class Branching16 {

	public static void main(String[] args) {
		int x = 1;
		int y = -1;

		if (x == 0 & y == 0) {
			System.out.println("Точка расположена в начале координат");
		} else if (x == 0) {
			System.out.println("Точка лежит на оси X");
		} else if (y == 0) {
			System.out.println("Точка лежит на оси Y");
		} else if (x > 0 & y > 0) {
			System.out.println("Точка расположена в I четверти");
		} else if (x < 0 & y > 0) {
			System.out.println("Точка расположена в II четверти");
		} else if (x < 0 & y < 0) {
			System.out.println("Точка расположена в III четверти");
		} else if (x > 0 & y < 0) {
			System.out.println("Точка расположена в IV четверти");
		}
	}

}
