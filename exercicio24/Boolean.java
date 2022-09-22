package exercicio24;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza o primeiro valor: ");
		int x = input.nextInt();

		System.out.println("Introduza o segundo valor: ");
		int y = input.nextInt();

		System.out.println("Introduza o terceiro valor: ");
		int z = input.nextInt();

		if (y > x && z > y) {
			System.out.println("A condição será  " + true);

		} else {
			System.out.println("A condição será " + false);
		}

		input.close();
	}

}
