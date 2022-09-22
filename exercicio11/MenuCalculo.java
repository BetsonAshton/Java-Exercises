package exercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCalculo {
	public static void main(String[] args) {

		boolean escolha = true;

		ArrayList<String> forma = new ArrayList<String>();

		forma.add("triângulo");
		forma.add("quadrado");
		forma.add("losango");
		forma.add("retângulo");

		while (escolha) {
			System.out.println("menu " + "\n 0 - triangulo " + "\n 1 - quadrado" + "\n 2 - losango "
					+ "\n 3 - retangulo" + "\n 4 - Sair\n");

			Scanner input = new Scanner(System.in);

			switch (input.next()) {
			case "0":
				System.out.println("Entre com a base e a altura do triangulo: ");

				double base = input.nextDouble();
				double altura = input.nextDouble();
				double area = base * altura / 2;

				System.out.println("A área é: " + area);

				break;

			case "1":
				System.out.println("Entre com o lado do quadrado: ");

				double lado = input.nextDouble();
				double area2 = Math.pow(lado, lado);
				System.out.println("A área é: " + area2);

				break;
			case "2":
				System.out.println("Entre com o valor das diagonais: ");
				double Diag = input.nextDouble();
				double diag = input.nextDouble();
				double area3 = Diag * diag / 2;
				System.out.println("A área é: " + area3);

				break;
			case "3":
				System.out.println("Entre com o valor das diagonais: ");
				double base1 = input.nextDouble();
				double altura1 = input.nextDouble();
				double area4 = base1 * altura1;
				System.out.println("A área é: " + area4);
				break;
			case "4":
				escolha = false;
				break;

			}

			input.close();

		}

	}

}
