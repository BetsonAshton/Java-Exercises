package exercicio27;

import java.util.Scanner;
/*
 * Java program that accepts two integer values between 25 to 75
 *  and return true if there is a common digit in both numbers
 */

public class ReturnTrue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza o primeiro Número: ");
		int number1 = input.nextInt();

		System.out.println("Introduza o segundo Número: ");
		int number2 = input.nextInt();

		if ((number1 >= 25 || number1 <= 75) && (number2 >= 25 || number2 <= 75) && number1 % 10 == number2 % 10
				|| number1 / 10 == number2 / 10) {

			// if(number1 % 10 == number2 % 10 || number1 / 10 == number2 / 10) {

			System.out.println(true);
			// }
		} else {
			System.out.println(false);
		}

	}

}
