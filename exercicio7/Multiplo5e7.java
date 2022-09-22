package exercicio7;

import java.util.Scanner;

public class Multiplo5e7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		if (num % 5 == 0 && num % 7 == 0) {
			System.out.println("Esse número e tanto múltiplo de 5 como de 7 ");
		} else if (num % 5 == 0) {
			System.out.println("Esse número é só multiplo de 5 ");

		} else if (num % 7 == 0) {
			System.out.println("Esse número é só multiplo de 7 ");
		} else {
			System.out.println("O número não é multiplo de 5 e nem de 7");
		}

		input.close();
	}

}
