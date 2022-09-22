package exercicio6;

import java.util.Scanner;

public class Multiplo5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		if (num % 5 == 0) {
			System.out.println("É um multiplo 5");
		} else {
			System.out.println("Não é multiplo de 5");
		}

		input.close();
	}

}
