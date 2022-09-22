package exercicio23;

import java.util.Scanner;

//Write a Java program to calculate the sum of two integers and
//return true if the sum is equal to a third integer

public class SomaBoolean {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza o primeiro valor: ");
		int a = input.nextInt();

		System.out.println("Introduza o segundo valor: ");
		int b = input.nextInt();

		System.out.println("introduza o terceiro valor: ");
		int c = input.nextInt();

		if (a + b == c) {
			System.out.println("A condição será " + true);

		} else {
			System.out.println("A condição será " + false);
		}

		input.close();
	}

}
