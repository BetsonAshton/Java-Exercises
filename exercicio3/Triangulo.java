package exercicio3;
/* exercise of inserting the base and height of the triangle,
 *  and calculating its area
 */

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("insira o valor da base : ");
		int b = input.nextInt();

		System.out.println("insira o valor da altura : ");
		int h = input.nextInt();

		double area = b * h / 2;

		System.out.println("A área do triangulo será " + area);

		input.close();
	}

}
