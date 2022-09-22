package exercicio20;

import java.util.Scanner;

public class ConversaoHexadecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza o valor: ");
		int y = input.nextInt();
		String hexadecimal = Integer.toString(y, 16); // decimal to Hex

		System.out.println("A conversão será: " + hexadecimal);

		input.close();

	}

}
