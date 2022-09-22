package exercicio26;

import java.util.Scanner;

/* exrecise: Java program that accepts two integer values from the user and return the larger values,
 * However if the two values are the same,
 *  return 0 and return the smaller value if the two values have the same remainder when divided by 6.
 */

public class Return {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valor1 = input.nextInt();
		int valor2 = input.nextInt();

		int n1 = valor1 % 6;
		int n2 = valor2 % 6;
		if (n1 == n2 && valor1 != valor2) {

			System.out.println(Math.min(valor1, valor2));

		} else if (valor1 > valor2 || valor2 > valor1) {

			System.out.println(Math.max(valor1, valor2));

		} else if (valor1 == valor2) {

			System.out.println(0);
		}
	}

}
