package exercicio9;

import java.util.Scanner;

public class SomaWhile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite os valores: ");

		int a = input.nextInt();
		int b = input.nextInt();

		double soma = a + b;

		while (soma <= 10) {
			System.out.println("A soma é: " + soma);
			break;
		}

		input.close();
	}

}
