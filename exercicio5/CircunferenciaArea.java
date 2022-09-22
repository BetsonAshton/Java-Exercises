package exercicio5;

import java.util.Scanner;

public class CircunferenciaArea {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double pi = 3.14;

		double r = input.nextDouble();

		double area = pi * Math.pow(r, 2);

		double circu = 2 * pi * r;

		System.out.println("A área do círculo é " + area);
		System.out.println("O comprimento da circunferência é " + circu);

		input.close();
	}

}
