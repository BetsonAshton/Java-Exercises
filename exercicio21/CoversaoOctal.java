package exercicio21;

import java.util.Scanner;

public class CoversaoOctal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor:");
		int numb = input.nextInt();

		String octal = Integer.toString(numb, 8); // decimal to octal

		System.out.println("O valor será: " + octal);

		input.close();

	}

}
