package exercicio22;

import java.util.Scanner;

public class BinarioparaDecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza o valor binário: ");
		String binary = input.next();

		int decimal = Integer.parseInt(binary, 2);

		System.out.println("O valor convertido para decimal será: " + decimal);

		input.close();
	}

}
