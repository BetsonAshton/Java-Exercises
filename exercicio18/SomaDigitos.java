package exercicio18;

import java.util.Scanner;

public class SomaDigitos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;
		int y = input.nextInt();
		;
		int sum = 0;

		while (y != 0) {

			x = y % 10;
			sum += x;
			y /= 10;

		}
		System.out.println(sum);

		input.close();

	}

}
