package exercicio2;

/* program to convert the temperature in Degree Centigrade to Fahrenheit*/

import java.util.Scanner;

public class ConversaoTemperatura {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o Valor: ");

		int i = input.nextInt();
		double calc1 = i * 9 / 5;
		double calc2 = calc1 + 32;

		System.out.println(calc2 + " F");

		input.close();

	}

}
