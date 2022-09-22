package exercicio19;

import java.util.Scanner;

public class DecimalparaBinario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza o número: ");
		int x = input.nextInt();

		String binary = Integer.toBinaryString(x);

		System.out.println("O número convertido em binário é: " + binary);

		input.close();

	}

}
