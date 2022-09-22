package exercicio1;

/* Exercise: program to check whether the given number is even or odd*/

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Informe o Número: ");
		int valor = Integer.parseInt(input.nextLine());
		int i = valor % 2;

		if (i == 0) {
			System.out.println(" O Número é Par!!");

		} else {
			System.out.println("O Número é ímpar!!!");
		}

		input.close();
	}

}
