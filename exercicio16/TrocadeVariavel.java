package exercicio16;

import java.util.Scanner;

public class TrocadeVariavel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor de a: ");
		int a = input.nextInt();
		System.out.println("Insira o valor de b: ");
		int b = input.nextInt();

		a = a ^ b ^ (b = a);

		System.out.println("\nOs  valores trocados em a e b será:  \n");
		System.out.println("a = " + a);
		System.out.println("\nb = " + b);

		input.close();

	}

}
