package exercicio13;

import java.util.Scanner;

public class Calculo {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("insira o número: ");
		double i = input.nextDouble();
		System.out.println("insira o segundo número: ");
		double n = input.nextDouble();

		double sum = i + n;
		double multiply = i * n;
		double divide = i / n;
		double remainder = i % n;

		System.out.println("A soma é: \n" + sum + "\nAmultiplicção é: \n" + multiply + "\nAdivisão é: \n" + divide
				+ "\nO resto é: \n" + remainder);

		input.close();

	}

}
